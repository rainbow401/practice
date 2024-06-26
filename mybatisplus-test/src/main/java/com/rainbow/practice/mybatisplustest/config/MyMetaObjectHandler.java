package com.rainbow.practice.mybatisplustest.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐使用)
        // 或者
        this.strictInsertFill(metaObject, "createTime", () -> LocalDateTime.now(), LocalDateTime.class); // 起始版本 3.3.3(推荐)
        // 或者
        this.fillStrategy(metaObject, "createTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug)
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
//        this.strictUpdateFill(metaObject, "deletedAt", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
//        Integer deleted = (Integer) getFieldValByName("deletedA", metaObject);
//        if(deleted == 1) {
//            this.strictUpdateFill(metaObject, "deletedAt", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)\
//        }
        this.strictUpdateFill(metaObject, "loginName", String.class, "test1111");
        this.strictUpdateFill(metaObject, "deletedAt", Date.class, new Date()); // 起始版本 3.3.0(推荐)\


//        // 或者
//        this.strictUpdateFill(metaObject, "updateAt", () -> LocalDateTime.now(), LocalDateTime.class); // 起始版本 3.3.3(推荐)
//        // 或者
//        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug)
    }
}