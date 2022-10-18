package com.example.mars_rover_photos.service;

import com.example.mars_rover_photos.dto.HomeDto;
import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.response.MarsPhotos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarsRoverAPIService {
    private static final String API_KEY ="7C3efywnhiZulYlDVdUYW9M5u71tIS22nmcak61h";
    public ApiResponseRoverPhotos getRoverData(HomeDto homeDto) {
        RestTemplate rt = new RestTemplate();

        List<String> apiUrlEndpoints = getApiUrlEndpoints(homeDto);
        List<MarsPhotos> photos = new ArrayList<>();
        ApiResponseRoverPhotos response = new ApiResponseRoverPhotos();


        apiUrlEndpoints.stream()
                .forEach(url -> {
                    ApiResponseRoverPhotos apiResponse = rt.getForObject(url, ApiResponseRoverPhotos.class);
                    photos.addAll(apiResponse.getPhotos());
                });

        response.setPhotos(photos);
        return response;
    }
        public List<String> getApiUrlEndpoints (HomeDto homeDto) {
            List<String> urls = new ArrayList<>();
            if (Boolean.TRUE.equals(homeDto.getCameraFhaz())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=FHAZ");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraChemCam()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=CHEMCAM");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraMahli()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=MAHLI");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraMardi()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=MARDI");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraMast()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=MAST");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraMinites()) && !"curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=MINITES");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraNavcam())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=NAVCAM");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraPancam()) && !"curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=PANCAM");
            }
            if (Boolean.TRUE.equals(homeDto.getCameraRhaz())) {
                urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=RHAZ");
            }
            return urls;

    }
}
