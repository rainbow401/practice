package com.rainbow.practice.mybatisplustest.service;

import com.rainbow.practice.mybatisplustest.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;

import java.util.List;
import java.util.Collection;
import java.util.Map;

/**
* @author lenovo
* @description 针对表【user(业务域_用户管理)】的数据库操作Service
* @createDate 2024-04-25 15:41:13
*/
public interface UserService extends IService<User> {

    void testSaveBatch();
}
