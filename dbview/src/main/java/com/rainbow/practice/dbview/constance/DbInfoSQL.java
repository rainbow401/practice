package com.rainbow.practice.dbview.constance;

/**
 * @author yanzhihao
 * @since 2023/4/28
 */
public interface DbInfoSQL {

    String GET_COLUMNS = "show full columns from ?";
    String GET_TABLES = "show tables";
    String GET_DDL = "show create table ?";
    String GET_SIMPLE_COLUMNS = "describe ?";
    String GET_DATABASE = "show databases";

}

