package com.restop.gateway.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Setter;

@Setter
@DynamoDBTable(tableName = "user")
public class User {
    private String userId;
    private String name;

    public User(){}

    public User(String name) {
        this.name = name;
    }

    @DynamoDBHashKey(attributeName = "userId")
    public String getUserId() {
        return userId;
    }

    @DynamoDBRangeKey(attributeName = "name")
    public String getName() {
        return name;
    }
}
