package com.saferich.business.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saferich.api.log.ILogRemoteBusiness;
import com.saferich.dao.log.user.mapper.UserMapper;
import com.saferich.dao.log.user.model.User;

@Service
public class LogRemoteBusiness implements ILogRemoteBusiness {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void printOut() {
        System.out.println("app run!--------------------------------");
    }

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

}
