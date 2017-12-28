package com.SZNOTEC.OrderSystem.controller;

import com.SZNOTEC.OrderSystem.entity.User;
import com.SZNOTEC.OrderSystem.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;

@Controller
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/signIn.do")
    public ModelAndView SignIn(@RequestParam String userId, @RequestParam String userPwd) throws
            Exception {

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute()方法，以后在jsp页面中可以通过itemsList取数据
        System.out.println("Controller get userId & userPwd : [" + userId + ", " + userPwd + "]");

        User user = userService.signIn(userId, userPwd);
        if (null != user) {

            modelAndView.addObject("UserAccount", user);

            //指定视图
            modelAndView.setViewName("/WEB-INF/jsp/MgmtMain.jsp");


        }

        return modelAndView;
    }



    public String value() {
        return null;
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
