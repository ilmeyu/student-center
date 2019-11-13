package com.ilem.server;

import com.ilem.domain.AuthUser;
import com.ilem.dto.input.user.AuthUserListRpcIn;

import java.util.List;

/**
 * @author yuwenkai
 * @date 2019/10/27 8:56 下午
 **/
public interface AuthUserService {

	List<AuthUser> queryUserList(AuthUserListRpcIn authUser);
}
