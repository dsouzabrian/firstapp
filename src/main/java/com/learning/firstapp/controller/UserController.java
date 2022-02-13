package com.learning.firstapp.controller;

import com.learning.firstapp.dto.UserDTO;
import com.learning.firstapp.model.User;
import com.learning.firstapp.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public UserDTO createUser(@RequestBody UserDTO createUserDto)  {

        return userService.register(createUserDto);
    }

    @RequestMapping(value="/check",method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public UserDTO checkUser(@RequestBody UserDTO createUserDto)  {

        return userService.register(createUserDto);
    }
    }

