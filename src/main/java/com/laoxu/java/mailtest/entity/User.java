package com.laoxu.java.mailtest.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * @description: 用户
 * @author: luohanye
 * @create: 2019-04-17
 **/
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String email;
    // 激活状态 0 未激活 1 已激活
    private Integer activeStatus;
    // 激活码
    private String activeCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }


}
