package com.restop.gateway.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.restop.gateway.dtos.UserDTO;
import com.restop.gateway.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private DynamoDBMapper mapper;

    public UserDTO insertIntoDynamoDB(UserDTO userDTO){
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setName(userDTO.getName());
        mapper.save(user);
        return convertDto(user);
    }

    public UserDTO convertDto(User user){
        return new UserDTO(
                user.getUserId(),
                user.getName()
        );
    }

}
