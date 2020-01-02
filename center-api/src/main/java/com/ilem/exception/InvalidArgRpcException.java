package com.ilem.exception;

/**
 * @Author ilem
 * @date 2020/1/2 2:09 下午
 * @since 1.0.0
 **/
public class InvalidArgRpcException extends RuntimeException {

	private static final long serialVersionUID = 3247051704563228643L;

	public InvalidArgRpcException(String message) {
		super(message);
	}

	public InvalidArgRpcException(String message, Throwable ex) {
		super(message, ex);
	}
}
