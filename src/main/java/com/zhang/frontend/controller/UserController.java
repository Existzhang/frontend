package com.zhang.frontend.controller;

import com.zhang.frontend.bean.User;
import com.zhang.frontend.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;




    @GetMapping("/user")
    public User getUser(Integer userId){
        User user = userService.getUserById(userId);

        return user;

    }

    @GetMapping("/allUser")

    public List<User> getAllUser(){

        List list = new ArrayList();


        for (int i = 0; i < 5; ++i){
            User user = new User();
            user.setUserId("0000" + i);
            user.setPassWord("123456");
            list.add(
                    user
            );
        }

        return list;

    }





}
