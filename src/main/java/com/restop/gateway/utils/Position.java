package com.restop.gateway.utils;

import com.google.maps.model.LatLng;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Position {

    private LatLng origin;
    private LatLng position;

}
