package com.restop.gateway.controller;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.restop.gateway.req.GetRouteReq;
import com.restop.gateway.resp.GetRouteResp;
import com.restop.gateway.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Map<String, String> env = System.getenv();
        System.out.println(env);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/getRoute")
    public GetRouteResp sendGetRouteReq (@RequestParam GetRouteReq req) {
        //TODO: googleにリクエスト処理を送る
        GetRouteResp resp = new GetRouteResp();
        return resp;
    }
}
