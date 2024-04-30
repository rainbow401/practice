package com.rainbow.practice.dbview.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TableColumn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 列名
     */
    private String field;

    /**
     * 数据类型
     */
    private String type;

    /**
     * 字符集和排序规则
     */
    private String collation;

    /**
     * 是否可为空
     */
    private Boolean nullable;

    /**
     * 是否为主键
     */
    private String key;


    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 额外信息（如自增等）
     */
    private String extra;

    /**
     * 权限（用于数据库操作）
     */
    private String privileges;

    /**
     * 列注释
     */
    private String comment;

    private String ddl;
}
