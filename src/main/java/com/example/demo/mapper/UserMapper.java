package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    UserBean getInfo(@Param("name") String name, @Param("password") String password);

}
