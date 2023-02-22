package com.zhang.frontend.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data


@TableName("user")
public class User {

    @TableId("user_id")
    private String userId;


    @TableField("user_name")
    private String passWord;

}
