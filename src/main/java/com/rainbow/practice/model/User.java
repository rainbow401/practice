package com.rainbow.practice.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

}
