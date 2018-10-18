package com.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Thanos Yu
 * @date 10/9/2018 11:49 AM
 */
@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/user")
//    @ResponseBody
//    public List<User> getUser() {
//        UserDao dao = new UserDao();
//        return dao.query();
//    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getUser1() {
        List<User> list= userService.search();
        return JSON.toJSONString(list);
    }
}
