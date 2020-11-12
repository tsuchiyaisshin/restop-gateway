package com.restop.gateway.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetRouteReq {

    private String origin;
    private String direction;

}
