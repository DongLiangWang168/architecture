package com.xinhui.xinhui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author EDZ
 */
@SpringBootApplication
@MapperScan("com.xinhui.xinhui.dao")
public class XinHuiApplication {
    public static void main(String[] args) {
        SpringApplication.run(XinHuiApplication.class, args);
    }
}
