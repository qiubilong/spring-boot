package com.my.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author chenxuegui
 * @since 2025/5/12
 */
@Slf4j
public class MyApplicationListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		//log.info("onApplicationEvent event={}",event.getClass());
		System.out.println("onApplicationEvent event="+event.getClass());
	}
}
