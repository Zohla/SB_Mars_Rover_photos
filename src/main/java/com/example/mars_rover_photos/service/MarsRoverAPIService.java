package com.example.mars_rover_photos.service;

import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverAPIService {
    private static final String API_KEY ="7C3efywnhiZulYlDVdUYW9M5u71tIS22nmcak61h";
    public ApiResponseRoverPhotos getRoverData(String roverType, Integer sol){
        RestTemplate rt = new RestTemplate();

        ResponseEntity<ApiResponseRoverPhotos> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+ roverType+" /photos?id=118330&sol="+sol+"&api_key=" + API_KEY, ApiResponseRoverPhotos.class);
        System.out.println(response.getBody());
        return response.getBody();

    }
}
