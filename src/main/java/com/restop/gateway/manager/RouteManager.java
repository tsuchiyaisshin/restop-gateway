package com.restop.gateway.manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.LatLng;
import com.google.maps.model.TravelMode;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RouteManager {
    private final String apiKey = System.getenv("GOOGLE_API_KEY");
    GeoApiContext context = new GeoApiContext.Builder()
            .apiKey(apiKey)
            .build();

    public DirectionsResult testAPI () throws InterruptedException, ApiException, IOException {
        LatLng origin= new LatLng(35.6, 139.6);
        LatLng destination = new LatLng(35.7, 139.7);

        DirectionsResult result = DirectionsApi.newRequest(context)
                .origin(origin)
                .destination(destination)
                .mode(TravelMode.DRIVING)
                .await();

        return result;
    };

}

