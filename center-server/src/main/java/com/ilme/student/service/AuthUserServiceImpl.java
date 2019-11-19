package com.ilme.student.service;

import com.ilem.domain.AuthUser;
import com.ilem.dto.input.user.AuthUserAddRpcIn;
import com.ilem.dto.input.user.AuthUserListRpcIn;
import com.ilem.server.AuthUserService;
import com.ilme.student.mapper.AuthUserMapper;
import com.ilme.student.model.AuthUserExample;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yuwenkai
 * @date 2019/10/27 8:57 下午
 **/
@Service
@Component
public class AuthUserServiceImpl implements AuthUserService {

	@Autowired
	AuthUserMapper authUserMapper;

	@Override
	public List<AuthUser> queryUserList(AuthUserListRpcIn authUser) {
		AuthUserExample authUserExample = new AuthUserExample();

		AuthUserExample.Criteria criteria = authUserExample.createCriteria();

		if (null != authUser.getCode())
			criteria.andCodeEqualTo(authUser.getCode());

		if (null != authUser.getName())
			criteria.andNameEqualTo(authUser.getName());

		return authUserMapper.selectByExample(authUserExample);
	}

	@Override
	public Boolean userAdd(AuthUserAddRpcIn rpcIn) {
		return null;
	}
}
