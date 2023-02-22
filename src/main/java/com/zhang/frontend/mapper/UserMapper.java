package com.zhang.frontend.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.frontend.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
