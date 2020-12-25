package com.pearadmin.modules.sys.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Describe: 在线用户领域模型
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@Data
public class SysOnlineUser {

    /**
     * 用户编号
     * */
    private String userId;

    /**
     * 用户名
     * */
    private String username;

    /**
     * 真实名称
     * */
    private String realName;

    /**
     * 登录时间
     * */
    private LocalDateTime lastTime;

    /**
     * 在线时长
     * */
    private String onlineTime;

}
