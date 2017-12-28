package com.SZNOTEC.OrderSystem.service;

import com.SZNOTEC.OrderSystem.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {

    User signIn(@Param("uid") String uid,
                @Param("pwd") String pwd);

    boolean changePwd(@Param("uid") String uid,
                      @Param("oldPwd") String oldPwd,
                      @Param("newPwd") String newPwd);

    User signUp(@Param("uid") String uid,
                @Param("pwd") String pwd,
                @Param("email") String email);
}
