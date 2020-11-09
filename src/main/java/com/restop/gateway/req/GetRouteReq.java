package com.restop.gateway.req;

public class GetRouteReq {

    private String origin;
    private String direction;

    public String getOrigin() {
        return origin;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
