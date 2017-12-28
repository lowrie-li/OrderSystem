package com.SZNOTEC.OrderSystem.service.impl;

import com.SZNOTEC.OrderSystem.dao.UserMapper;
import com.SZNOTEC.OrderSystem.entity.User;
import com.SZNOTEC.OrderSystem.entity.UserExample;
import com.SZNOTEC.OrderSystem.service.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

    @Resource
    private UserMapper userDao;

    public User signIn(String uid, String pwd) {

        System.out.println("Service get userId & userPwd : [" + uid + ", " + pwd + "]");

        UserExample queryCondition = new UserExample();

        queryCondition.or().andUidEqualTo(uid).andPwdEqualTo(pwd);

        List userList = userDao.selectByExample(queryCondition);

        System.out.println("Get " + userList.size() + " User(s)!");
        if (1 == userList.size()) {
            System.out.println(userList.get(0).toString());
            return (User)userList.get(0);
        } else {
            return null;
        }

    }

    public boolean changePwd(String uid, String oldPwd, String newPwd) {

        boolean re = false;
        UserExample queryCondition = new UserExample();
        queryCondition.or().andUidEqualTo(uid).andPwdEqualTo(oldPwd);

        if (1 == userDao.countByExample(queryCondition)) {
            User user = new User();
            user.setUid(uid);
            user.setPwd(newPwd);

            if (1 == userDao.updateByExample(user, queryCondition)) {
                re = true;
            }
        }

        return re;
    }

    public User signUp(String uid, String pwd, String email) {

        UserExample queryCondition = new UserExample();

        queryCondition.or().andUidEqualTo(uid);

        if (0 == userDao.countByExample(queryCondition)) {
            User user = new User();
            user.setUid(uid);
            user.setPwd(pwd);
            user.setEmail(email);

            if (1 == userDao.insertSelective(user)) {
                return null;
            }
        }

        queryCondition.or().andUidEqualTo(uid).andPwdEqualTo(pwd);

        List userList = userDao.selectByExample(queryCondition);
        if (1 == userList.size()) {
            return (User)userList.get(0);
        } else {
            return null;
        }
    }
}
