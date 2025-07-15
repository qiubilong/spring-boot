package com.my.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chenxuegui
 * @since 2025/7/15
 */
@Component
@ConfigurationProperties("my")
@Data
public class NacosConf {
	private String xxx;
}
