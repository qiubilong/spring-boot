package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author chenxuegui
 * @since 2025/2/6
 */
@SpringBootApplication
public class AppMain {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context = SpringApplication.run(AppMain.class, args);

		Thread.currentThread().join();
	}
}
