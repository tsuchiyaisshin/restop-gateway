package com.restop.gateway.dtos;

import com.restop.gateway.utils.Position;

public class SpotDTO {
    private String title;
    private Position position;
    private String icon;
    private String time;

    public SpotDTO(){}

    public SpotDTO(String title, Position position, String icon, String time){
        this.title = title;
        this.position = position;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public Position getPosition() {
        return position;
    }

    public String getIcon() {
        return icon;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SpotDTO{" +
                "title='" + title + '\'' +
                ", position=" + position +
                ", icon='" + icon + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
