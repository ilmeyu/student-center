package com.ilem.server;

import com.ilem.domain.AuthUser;
import com.ilem.dto.input.user.*;

import java.util.List;

/**
 * @author lime
 * @date 2019/10/27 8:56 下午
 **/
public interface AuthUserService {

	List<AuthUser> queryUserList(AuthUserQueryRpcIn rpcIn);

	List<AuthUser> queryUserPageList(AuthUserPageListRpcIn rpcIn);

	AuthUser userAdd(AuthUserAddRpcIn rpcIn);

	Integer userDelete(AuthUserDeleteRpcIn rpcIn);

	Integer userUpdate(AuthUserUpdateRpcIn rpcIn);

	AuthUser userSingleQuery(AuthUserQueryRpcIn rpcIn);
}
