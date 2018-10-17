package com.test.controller;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Thanos Yu
 * @date 10/9/2018 11:49 AM
 */
@Controller
@RequestMapping("/test")//Contoller下所有接口统一入口
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public List<User> getUser() {
        UserDao dao = new UserDao();
        return dao.query();
    }

    @RequestMapping("/user1")
    @ResponseBody
    public List<User> getUser1() {
        return userService.search();
    }
}
