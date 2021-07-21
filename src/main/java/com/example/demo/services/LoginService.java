package com.example.demo.services;

import com.example.demo.bean.LoginUserInfo;
import com.example.demo.mapper.QueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qiuyue
 * @create 2021/7/21  14:02
 */
@Service
public class LoginService {


    @Autowired(required=false)
    private QueryMapper queryMapper;


    public boolean login(String username, String password) {
        int num = queryMapper.queryLoginInfoByLoginName(username);
        System.out.println("[num]"+num);
        if (num < 1) {
            return false;
        }else{
            LoginUserInfo info = checkLogin(username, password);
            System.out.println("[info]"+info);
            if (info != null) {
                return true;
            } else {
                return false;
            }
        }

    }

    /**
     * 判断账号和密码是否正确
     */
    private LoginUserInfo checkLogin(String username, String password) {
        return queryMapper.queryLoginInfo(username, password);
    }

}
