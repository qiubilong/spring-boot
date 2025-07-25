package com.my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenxuegui
 * @since 2025/3/7
 */
public class TestLog {

    /* 日志入口 */
    static Logger logger = LoggerFactory.getLogger("ROOT");
    static Logger logger1 = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        logger.info("eeee"); // ch.qos.logback.classic.Logger
        logger1.info("xxx");

    }


}
