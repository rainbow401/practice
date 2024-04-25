package com.rainbow.practice.mybatisplustest;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: yzh
 * @Date: 2024/4/24
 * @Description:
 */
@Slf4j
@MapperScan(value = {"com.rainbow.practice.mybatisplustest.**.mapper","com.rainbow.practice.mybatisplustest.mapper"})
@SpringBootApplication
public class MybatisPlusTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(MybatisPlusTest.class, args);
    }
}