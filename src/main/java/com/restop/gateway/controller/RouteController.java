package com.restop.gateway.controller;

import java.io.IOException;

import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.restop.gateway.manager.RouteManager;
import com.restop.gateway.req.GetRouteReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    @Autowired
    RouteManager routeManager;

    @GetMapping("/getRoute")
    public DirectionsResult sendGetRouteReq (@ModelAttribute GetRouteReq req) throws InterruptedException, ApiException, IOException {
        DirectionsResult result = routeManager.testAPI();
        return result;
    }
}
