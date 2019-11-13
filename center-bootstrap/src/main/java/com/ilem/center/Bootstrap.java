package com.ilem.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author yuwenkai
 * @date 2019/10/27 3:03 下午
 **/
@SpringBootApplication(scanBasePackages = {
		"com.ilme.student"
})
@MapperScan(basePackages = "com.ilme.student.mapper")
public class Bootstrap {

	public static void main(String[] args) {
		SpringApplication.run(Bootstrap.class, args);
	}

}
