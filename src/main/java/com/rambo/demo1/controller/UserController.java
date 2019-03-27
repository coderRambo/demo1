package com.rambo.demo1.controller;

import com.rambo.demo1.entity.User;
import com.rambo.demo1.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Rambo_yb
 * @Date: 2019/3/25 10:19
 * @Version 1.0
 */
@RestController
@Api(description = "用户接口") //标注为swagger
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "添加用户")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }
    @ApiOperation(value = "根据ID查询用户")
    @GetMapping("/user/{id}")
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getuser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id).get();
        return user;
    }

    @ApiOperation(value = "修改用户信息")
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public User updateuser(User user){
        User user1 = userRepository.save(user);
        return user1;
    }

    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findAllUser(){
        List<User> list=userRepository.findAll() ;
        return list;
    }

    @ApiOperation(value = "删除一个用户")
    @DeleteMapping("/user{id}")
    public void deleteUser(User user){
        userRepository.delete(user);
    }

}
