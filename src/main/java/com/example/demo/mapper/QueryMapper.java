package com.example.demo.mapper;

import com.example.demo.bean.LoginUserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author qiuyue
 * @create 2021/7/21  15:02
 */
public interface QueryMapper {

    LoginUserInfo queryLoginInfo(@Param("username") String username , @Param("password")String password);

    Integer queryLoginInfoByLoginName(@Param("username") String username);


}
