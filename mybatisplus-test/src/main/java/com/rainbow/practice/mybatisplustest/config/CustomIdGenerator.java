package com.rainbow.practice.mybatisplustest.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.stereotype.Component;

public class CustomIdGenerator implements IKeyGenerator {

    @Override
    public String executeSql(String incrementerName) {
        return String.format("select fn_nextval('%s')", incrementerName);
    }

    @Override
    public DbType dbType() {
        return DbType.MYSQL;
    }
}