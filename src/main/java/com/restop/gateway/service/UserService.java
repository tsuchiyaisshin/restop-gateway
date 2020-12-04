package com.restop.gateway.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.restop.gateway.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private DynamoDBMapper mapper;

    public User insertIntoDynamoDB(User user){
        mapper.save(user);
        return user;
    }

}
