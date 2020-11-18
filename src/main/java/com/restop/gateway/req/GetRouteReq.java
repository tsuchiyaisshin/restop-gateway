package com.restop.gateway.req;

import com.google.maps.model.LatLng;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetRouteReq {

    private LatLng origin;
    private LatLng direction;

}
