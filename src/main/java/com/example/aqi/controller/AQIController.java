package com.example.aqi.controller;

import com.example.aqi.service.AQIService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") 
public class AQIController {

    private final AQIService aqiService;

    public AQIController(AQIService aqiService) {
        this.aqiService = aqiService;
    }

    @GetMapping("/aqi")
    public Map<String, Object> fetchAQI(@RequestParam double lat, @RequestParam double lng) {
        return aqiService.getAqiData(lat, lng);
    }
}