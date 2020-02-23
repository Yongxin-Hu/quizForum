package com.bjergsen.quiz.controller;

import com.bjergsen.quiz.mapper.UserMapper;
import com.bjergsen.quiz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author yongxin
 * @Date 2020/2/22
 */
@Controller
public class HelloController {
    @Autowired
    public UserMapper userMapper;

    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("user_token")){
                User user = userMapper.findUserByToken(cookie.getValue());
                if (user != null){
                    request.getSession().setAttribute("user", user);
                }
                break;
            }
        }
        return "/index";
    }

}
