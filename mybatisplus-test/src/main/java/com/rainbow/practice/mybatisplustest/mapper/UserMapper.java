package com.rainbow.practice.mybatisplustest.mapper;

import com.rainbow.practice.mybatisplustest.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author lenovo
* @description 针对表【user(业务域_用户管理)】的数据库操作Mapper
* @createDate 2024-04-25 15:41:13
* @Entity com.rainbow.practice.mybatisplustest.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




