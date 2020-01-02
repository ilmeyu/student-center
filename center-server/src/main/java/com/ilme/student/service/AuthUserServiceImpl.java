package com.ilme.student.service;

import com.ilem.domain.AuthUser;
import com.ilem.dto.input.user.*;
import com.ilem.exception.RpcException;
import com.ilem.server.AuthUserService;
import com.ilme.student.converter.AuthUserConverter;
import com.ilme.student.mapper.AuthUserMapper;
import com.ilme.student.model.AuthUserExample;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author lime
 * @date 2019/10/27 8:57 下午
 **/
@Service
@Component
public class AuthUserServiceImpl implements AuthUserService {

	@Autowired
	AuthUserMapper authUserMapper;

	@Autowired
	AuthUserConverter authUserConverter;

	@Override
	public List<AuthUser> queryUserList(AuthUserQueryRpcIn rpcIn) {
		AuthUserExample authUserExample = new AuthUserExample();

		AuthUserExample.Criteria criteria = authUserExample.createCriteria();

		if (null != rpcIn.getId()) {
			criteria.andCodeEqualTo(rpcIn.getId());
		}

		if (null != rpcIn.getName()) {
			criteria.andNameLike(rpcIn.getName());
		}

		if (null != rpcIn.getPhone()) {
			criteria.andPhoneLike(rpcIn.getPhone());
		}

		return authUserMapper.selectByExample(authUserExample);
	}

	@Override
	public List<AuthUser> queryUserPageList(AuthUserPageListRpcIn rpcIn) {
		return Collections.emptyList();
	}

	@Override
	public AuthUser userAdd(AuthUserAddRpcIn rpcIn) {
		AuthUserExample authUserQuery = new AuthUserExample();
		AuthUserExample.Criteria criteria = authUserQuery.createCriteria();
		criteria.andIdEqualTo(rpcIn.getId());
		List<AuthUser> authUsers = authUserMapper.selectByExample(authUserQuery);

		if (CollectionUtils.isNotEmpty(authUsers)) {
			throw new RpcException("用户id已存在！");
		}

		AuthUser authUser = authUserConverter.userAddDto2Do(rpcIn);
		authUser.setCreatedTime(new Date());

		return authUserMapper.insert(authUser) > 1 ? authUser : null;
	}

	@Override
	public Integer userDelete(AuthUserDeleteRpcIn rpcIn) {
		if (null == rpcIn.getId()) {
			throw new RpcException("删除的用户id不允许为空！");
		}
		return authUserMapper.deleteByPrimaryKey(rpcIn.getId());
	}

	@Override
	public Integer userUpdate(AuthUserUpdateRpcIn rpcIn) {
		if (null == rpcIn.getId()) {
			throw new RpcException("更新的用户id不允许为空！");
		}
		AuthUser authUser = authUserConverter.userUpdateDto2Do(rpcIn);
		return authUserMapper.updateByPrimaryKey(authUser);
	}

	@Override
	public AuthUser userSingleQuery(AuthUserQueryRpcIn rpcIn) {
		if (null == rpcIn.getId()) {
			throw new RpcException("查询的用户id不允许为空！");
		}
		return authUserMapper.selectByPrimaryKey(rpcIn.getId());
	}
}
