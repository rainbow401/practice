package com.rainbow.practice.dbview;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: yzh
 * @Date: 2024/4/24
 * @Description:
 */
@Slf4j
//@MapperScan(value = {"com.rainbow.practice.dbview.**.mapper","com.rainbow.practice.dbview.mapper"})
@SpringBootApplication
public class DbView {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DbView.class, args);
    }
}