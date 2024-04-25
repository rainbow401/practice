package com.rainbow.practice.mybatisplustest.controller;

import com.rainbow.practice.mybatisplustest.domain.User;
import com.rainbow.practice.mybatisplustest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yzh
 * @Date: 2024/4/25
 * @Description:
 */
@RestController
@RequestMapping("/")
public class Test {

    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public void test() {
        userService.testSaveBatch();
    }


    @RequestMapping("/update")
    public void update(@RequestParam("id") String id) {
        User user = new User();
        user.setId(id);
        user.setLoginName("update");
        userService.updateById(user);
    }

    @RequestMapping("/remove")
    public void remove(@RequestParam("id") String id) {
        userService.removeById(id);
    }
}
