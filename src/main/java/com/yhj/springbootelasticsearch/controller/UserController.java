package com.yhj.springbootelasticsearch.controller;

import com.yhj.springbootelasticsearch.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public void add(){
        new User().setAge(1).setAge(1);
    }
}
