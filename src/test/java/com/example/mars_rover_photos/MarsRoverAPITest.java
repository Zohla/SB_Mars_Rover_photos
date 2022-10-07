package com.example.mars_rover_photos;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverAPITest {

    @Test
    public void smallTest() {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<ApiResponseRoverPhotos> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/opportunity/photos?id=118330&sol=100&api_key=7C3efywnhiZulYlDVdUYW9M5u71tIS22nmcak61h", ApiResponseRoverPhotos.class);
        System.out.println(response.getBody());
    }
}
