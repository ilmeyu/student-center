package com.ilem.dto.common;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ilme
 * @date 2019/10/29 11:51 上午
 **/
@Setter
@Getter
@Accessors(chain = true)
public class RpcResponse<T> implements Serializable {
	private static final long serialVersionUID = 9046332001579895894L;

	private Integer code;

	private T data;

	private String msg;

	public static <T> RpcResponse<T> ok(T t) {
		return
		new RpcResponse<T>()
			.setCode(0)
			.setData(t)
			.setMsg("Ok");
	}

	public static <T> RpcResponse<T> fail(String msg) {
		return
		new RpcResponse<T>()
			.setCode(-1)
			.setMsg(msg);
	}

}
