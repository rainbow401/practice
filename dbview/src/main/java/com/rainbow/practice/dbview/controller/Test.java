package com.rainbow.practice.dbview.controller;

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


    @RequestMapping("/test")
    public void test() {

    }


    @RequestMapping("/update")
    public void update(@RequestParam("id") String id) {

    }

    @RequestMapping("/remove")
    public void remove(@RequestParam("id") String id) {

    }
}
