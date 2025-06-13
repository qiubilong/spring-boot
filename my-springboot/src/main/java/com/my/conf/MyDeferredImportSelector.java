package com.my.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author chenxuegui
 * @since 2025/5/13
 */
@Slf4j
public class MyDeferredImportSelector implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		log.info("selectImports importingClassMetadata={}",importingClassMetadata);
		return new String[0];
	}

	@Override
	public Class<? extends Group> getImportGroup() {
		log.info("getImportGroup ..");

		return null;
	}
}
