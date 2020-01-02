package com.ilem.center;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * @Author ilem
 * @date 2020/1/2 3:29 下午
 * @since 1.0.0
 **/
@Slf4j
@Order
@Aspect
//@Component
public class Aop {

	@Pointcut(value = "within(com.ilme.student.service)")
	public void pointcut() {

	}
}
