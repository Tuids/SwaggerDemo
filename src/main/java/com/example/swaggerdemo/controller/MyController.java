package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

/**
 * @author : KaelvihN
 * @date : 2023/9/16 0:51
 */

@RestController
@Api(tags = "MyController")
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PutMapping("/bye")
    public String bye() {
        return "bye";
    }

    @PostMapping("/user")
    @ApiOperation("获取用户对象")
    public User selectUser() {
        return new User("KaelvihN", 23);
    }
}
