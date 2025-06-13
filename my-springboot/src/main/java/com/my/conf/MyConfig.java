package com.my.conf;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author chenxuegui
 * @since 2025/5/13
 */
@Component
@Import(MyDeferredImportSelector.class)
public class MyConfig {
}
