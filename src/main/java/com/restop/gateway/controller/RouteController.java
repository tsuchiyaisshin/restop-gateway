package com.restop.gateway.controller;

import java.io.IOException;

import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.restop.gateway.manager.RouteManager;
import com.restop.gateway.req.GetRouteReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:9000"})
@RestController
public class RouteController {

    @Autowired
    RouteManager routeManager;

    @PostMapping("/getRoute")
    public DirectionsResult sendGetRouteReq (@RequestBody GetRouteReq req) throws InterruptedException, ApiException, IOException {
        DirectionsResult result = routeManager.getRoute(req.getOrigin(), req.getDirection());
        return result;
    }
}
