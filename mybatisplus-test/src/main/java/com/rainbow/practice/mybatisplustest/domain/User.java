package com.rainbow.practice.mybatisplustest.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业务域_用户管理
 * @TableName user
 */
@KeySequence(value = "UI")
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 主键Id(UI)
     */
    @TableId(value = "Id", type = IdType.INPUT)
    private String id;

    /**
     * 竞拍人账户
     */
    @TableField(value = "LoginName")
    private String loginName;

    /**
     * 企业名称
     */
    @TableField(value = "CompanyName")
    private String companyName;

    /**
     * 企业联系人名称
     */
    @TableField(value = "LinkManName")
    private String linkManName;

    /**
     * 联系电话号
     */
    @TableField(value = "LinkManTel")
    private String linkManTel;

    /**
     * 用户角色（1 管理员；2 竞拍人）
     */
    @TableField(value = "RoleName")
    private Integer roleName;

    /**
     * 用户中心存储角色对应Id
     */
    @TableField(value = "RoleId")
    private String roleId;

    /**
     * 用户中心存储对应用户Id
     */
    @TableField(value = "UserCenterId")
    private String userCenterId;

    /**
     * 创建人
     */
    @TableField(value = "CreatedById")
    private String createdById;

    /**
     * 开通时间
     */
    @TableField(value = "CreatedAt")
    private Date createdAt;

    /**
     * 
     */
    @TableField(value = "UpdatedById", fill = FieldFill.UPDATE)
    private String updatedById;

    /**
     * 修改时间
     */
    @TableField(value = "UpdatedAt", fill = FieldFill.UPDATE)
    private Date updatedAt;

    /**
     * 
     */
    @TableField(value = "DeletedById", fill = FieldFill.UPDATE)
    private String deletedById;

    /**
     * 
     */
    @TableField(value = "DeletedAt", fill = FieldFill.UPDATE)
    private Date deletedAt;

    /**
     * 是否删除(0 否；1 是)
     */
    @TableLogic(value = "0", delval = "1")
    @TableField(value = "Deleted")
    private Integer deleted;
}