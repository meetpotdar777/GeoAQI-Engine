package com.example.aqi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Map;

@Service
public class AQIService {

    // IMPORTANT: Replace with your actual token from https://aqicn.org/api/
    private final String API_TOKEN = "YOUR_API_TOKEN"; 
    private final String BASE_URL = "https://api.waqi.info/feed/geo:";

    public Map<String, Object> getAqiData(double lat, double lng) {
        RestTemplate restTemplate = new RestTemplate();
        
        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL + lat + ";" + lng + "/")
                .queryParam("token", API_TOKEN)
                .toUriString();

        try {
            return restTemplate.getForObject(url, Map.class);
        } catch (Exception e) {
            return Map.of("status", "error", "message", "API Connection Failed");
        }
    }
}