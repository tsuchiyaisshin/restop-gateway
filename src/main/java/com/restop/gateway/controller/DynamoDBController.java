package com.restop.gateway.controller;

import com.restop.gateway.dtos.UserDTO;
import com.restop.gateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dynamoDb")
public class DynamoDBController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserDTO insertIntoDynamoDB(@RequestBody UserDTO dto) {
        return userService.insertIntoDynamoDB(dto);
    }
}
