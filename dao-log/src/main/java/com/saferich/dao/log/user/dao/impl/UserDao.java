/*
 * Copyright (C), 2013-2016, 嘉丰瑞德
 * FileName: UserDao.java
 * Author:   Administrator
 * Date:     2016年2月1日 下午3:57:54
 * Description: //模块目的、功能描述
 */
package com.saferich.dao.log.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saferich.dao.log.user.dao.IUserDao;
import com.saferich.dao.log.user.mapper.UserMapper;
import com.saferich.dao.log.user.model.User;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author Administrator
 */
@Service
public class UserDao implements IUserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

}
