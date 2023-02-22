package com.zhang.frontend.service;

import com.zhang.frontend.bean.User;
import com.zhang.frontend.mapper.UserMapper;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer userId){

        User user = userMapper.selectById(userId);

        return user;
    }

}
