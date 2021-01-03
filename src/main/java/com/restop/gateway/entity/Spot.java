package com.restop.gateway.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.restop.gateway.utils.Position;

@DynamoDBTable(tableName = "spot")
public class Spot {
    private String title;
    private Position position;
    private String icon;

    public Spot(){}

    @DynamoDBHashKey(attributeName = "title")
    public String getTitle() {
        return title;
    }

    @DynamoDBAttribute(attributeName = "position")
    public Position getPosition() {
        return position;
    }

    @DynamoDBAttribute(attributeName = "icon")
    public String getIcon() {
        return icon;
    }
}
