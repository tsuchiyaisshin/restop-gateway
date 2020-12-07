package com.restop.gateway.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.restop.gateway.dtos.UserDTO;
import com.restop.gateway.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<UserDTO> updateDynamoDB(UserDTO userDTO){
        User user = new User();
        user.setUserId(userDTO.getUserId());
        DynamoDBQueryExpression<User> queryExpression = new DynamoDBQueryExpression<User>()
                .withHashKeyValues(user);

        List<User> users = mapper.query(User.class, queryExpression);

        ArrayList<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for(User u : users) {
            u.setName(userDTO.getName());
            mapper.save(u);
            userDTOS.add(convertDto(u));
        }

        return userDTOS;
    }

    public UserDTO convertDto(User user){
        return new UserDTO(
                user.getUserId(),
                user.getName()
        );
    }

}
