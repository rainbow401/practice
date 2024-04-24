package com.rainbow.other;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

@Slf4j
@MapperScan(value = {"com.rainbow.other.**.**.mapper", "com.rainbow.other.mybatisplus.autofill.mapper"})
@SpringBootApplication
@EnableKafka
public class PracticeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);
    }

}
