package com.restop.gateway.controller;

import com.restop.gateway.dtos.SpotDTO;
import com.restop.gateway.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:9000"})
@RestController
@RequestMapping("/spot")
public class SpotController {

    @Autowired
    private SpotService spotService;

    @PostMapping("/get")
    public SpotDTO getSpot(@RequestBody SpotDTO dto) {
        return spotService.getSpot(dto);
    }

    @PostMapping("/save")
    public SpotDTO saveSpot(@RequestBody SpotDTO dto) {
        return spotService.insertIntoSpot(dto);
    }

    @PostMapping("/update")
    public SpotDTO updateSpot(@RequestBody SpotDTO dto) {
        return spotService.updateSpot(dto);
    }

    @PostMapping("/delete")
    public SpotDTO deleteSpot(@RequestBody SpotDTO dto) {
        return spotService.deleteUser(dto);
    }
}
