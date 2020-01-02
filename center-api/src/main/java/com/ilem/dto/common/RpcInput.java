package com.ilem.dto.common;

import com.ilem.exception.InvalidArgRpcException;

import java.io.Serializable;

/**
 * @Author ilem
 * @date 2019/12/31 10:09 上午
 * @since 1.0.0
 **/
public interface RpcInput extends Serializable {

	void doCheck();

	default void check(Boolean except, String msg) {
		if (!except) {
			throw new InvalidArgRpcException(msg);
		}
	}
}
