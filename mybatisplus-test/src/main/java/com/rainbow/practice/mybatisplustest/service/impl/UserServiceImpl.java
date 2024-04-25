package com.rainbow.practice.mybatisplustest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainbow.practice.mybatisplustest.domain.User;
import com.rainbow.practice.mybatisplustest.mapper.UserMapper;
import com.rainbow.practice.mybatisplustest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author lenovo
* @description 针对表【user(业务域_用户管理)】的数据库操作Service实现
* @createDate 2024-04-25 15:41:13
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void testSaveBatch() {

        List<User> users = new ArrayList<>();
        for (int i =0; i< 1; i++) {
//            String id = jdbcTemplate.queryForObject("select fn_nextval('UI')", String.class);
            User user1 = new User();
//            user1.setId(id);
            user1.setLoginName("user" + i);
            users.add(user1);
        }

        this.saveBatch(users);
    }
}




