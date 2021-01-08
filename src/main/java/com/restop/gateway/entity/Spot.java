package com.restop.gateway.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.restop.gateway.utils.Position;
import lombok.Setter;

@Setter
@DynamoDBTable(tableName = "spot")
public class Spot {
    private String title;
    private Position position;
    private String icon;

    public Spot(){}

    public Spot(String title, Position position, String icon) {
        this.title = title;
        this.position = position;
        this.icon = icon;
    }

    @DynamoDBHashKey(attributeName = "title")
    public String getTitle() {
        return title;
    }

    @DynamoDBAttribute(attributeName = "position")
    @DynamoDBTypeConvertedJson
    public Position getPosition() {
        return position;
    }

    @DynamoDBAttribute(attributeName = "icon")
    public String getIcon() {
        return icon;
    }
}
