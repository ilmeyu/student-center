package com.ilem.exception;

/**
 * @Author ilem
 * @date 2020/1/2 10:18 上午
 * @since 1.0.0
 **/
public class RpcException extends RuntimeException {

	public RpcException() {
		super();
	}

	public RpcException(String message) {
		super(message);
	}

	public RpcException(String message, Throwable ex) {
		super(message, ex);
	}
}
