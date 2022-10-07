package com.example.mars_rover_photos.service;

import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverAPIService {

    public ApiResponseRoverPhotos getRoverData(){
        RestTemplate rt = new RestTemplate();

        ResponseEntity<ApiResponseRoverPhotos> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/opportunity/photos?id=118330&sol=100&api_key=7C3efywnhiZulYlDVdUYW9M5u71tIS22nmcak61h", ApiResponseRoverPhotos.class);
        System.out.println(response.getBody());
        return response.getBody();

    }
}
