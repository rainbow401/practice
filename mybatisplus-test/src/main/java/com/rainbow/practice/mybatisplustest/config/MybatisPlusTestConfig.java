package com.rainbow.practice.mybatisplustest.config;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yzh
 * @Date: 2024/4/25
 * @Description:
 */
@Configuration
public class MybatisPlusTestConfig {

    @Bean
    public IKeyGenerator keyGenerator() {
        return new CustomIdGenerator();
    }
}
