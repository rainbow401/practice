package com.rainbow.other.threadlocal.userinfo.service;


import com.rainbow.other.threadlocal.userinfo.context.UserInfo;
import com.rainbow.other.threadlocal.userinfo.context.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author yanzhihao
 * @date 2023/1/10
 * @Description
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public String getUserid() {
        return "1";
    }

    @Override
    public UserInfo getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("2");
        return userInfo;
    }
}
