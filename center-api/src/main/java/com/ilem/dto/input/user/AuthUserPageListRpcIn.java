package com.ilem.dto.input.user;

import com.ilem.dto.common.RpcPageIn;
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
public class AuthUserPageListRpcIn extends AuthUserQueryRpcIn {

	private RpcPageIn page;

	private static final long serialVersionUID = 9016137573174631135L;

	@Override
	public void doCheck() {
		super.doCheck();
		check(null == page, "分页方式不允许为空");
		page.doCheck();
	}
}
