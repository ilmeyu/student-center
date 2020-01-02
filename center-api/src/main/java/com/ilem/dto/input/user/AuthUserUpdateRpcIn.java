package com.ilem.dto.input.user;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author ilem
 * @date 2020/1/2 2:19 下午
 * @since 1.0.0
 **/
@Getter
@Setter
@Accessors(chain = true)
public class AuthUserUpdateRpcIn extends AuthUserAddRpcIn {

	private static final long serialVersionUID = -7903488917531016511L;

	/** ID */
	private String id;

	@Override
	public void doCheck() {
		super.doCheck();
	}
}
