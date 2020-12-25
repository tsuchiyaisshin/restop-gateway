package com.restop.gateway.controller;

import com.restop.gateway.dtos.UserDTO;
import com.restop.gateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:9000"})
@RestController
@RequestMapping("/user")
public class DynamoDBController {

    @Autowired
    private UserService userService;

    @PostMapping("/get")
    public UserDTO getUser(@RequestBody UserDTO dto) { return userService.getUser(dto); }

    @PostMapping("/save")
    public UserDTO insertIntoUser(@RequestBody UserDTO dto) {
        return userService.insertIntoUser(dto);
    }

    @PostMapping("/update")
    public UserDTO updateUser(@RequestBody UserDTO dto) {
        return userService.updateDynamoDB(dto);
    }

    @PostMapping("/delete")
    public UserDTO deleteUser(@RequestBody UserDTO dto) {
        return userService.deleteUser(dto);
    }
}
