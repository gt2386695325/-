package com.laoxu.java.mailtest.dao;

import com.laoxu.java.mailtest.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {
    /**
     *  注册
     * @param user
     */
    void insert(User user);

    /**
     *  根据激活码查询用户
     * @param activeCode
     * @return
     */
    User selectUserByActiveCode(String activeCode);

    /**
     *  更新用户
     * @param user
     */
    void update(User user);

    /**
     *  查询用户
     * @param user
     * @return
     */
    User select(User user);
}
