package com.ilem.dto.input.user;

import com.ilem.dto.common.RpcInput;
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
public class AuthUserDeleteRpcIn implements RpcInput {

	private static final long serialVersionUID = 5187025324623148335L;

	/** ID */
	private String id;

	@Override
	public void doCheck() {

	}
}
