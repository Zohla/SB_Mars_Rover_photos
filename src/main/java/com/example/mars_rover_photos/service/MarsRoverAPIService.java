package com.example.mars_rover_photos.service;

import com.example.mars_rover_photos.dto.HomeDto;
import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.response.MarsPhotos;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Service
public class MarsRoverAPIService {
    private static final String API_KEY ="7C3efywnhiZulYlDVdUYW9M5u71tIS22nmcak61h";

    private final Map<String, List<String>> validCameras = new HashMap<>();

    public MarsRoverAPIService(){
        validCameras.put("Opportunity", Arrays.asList("FHAZ", "RHAZ", "NAVCAM", "PANCAM", "MINITES"));
        validCameras.put("Curiosity", Arrays.asList("FHAZ", "RHAZ", "MAST", "CHEMCAM", "MAHLI", "MARDI", "NAVCAM"));
        validCameras.put("Spirit",  Arrays.asList("FHAZ", "RHAZ", "NAVCAM", "PANCAM", "MINITES"));
        validCameras.put("Perseverance", Arrays.asList("EDL_DDCAM","FRONT_HAZCAM_LEFT_A", "FRONT_HAZCAM_RIGHT_A", "REAR_HAZCAM_LEFT", "REAR_HAZCAM_RIGHT"));
    }

    public ApiResponseRoverPhotos getRoverData(HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {
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
        public List<String> getApiUrlEndpoints (HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {
            List<String> urls = new ArrayList<>();

            Method[] methods = homeDto.getClass().getMethods();

            //loops through all the public methods from homeDto
            for (Method method : methods){
                //checks if the method is a getter for a camera
               if(method.getName().indexOf("getCamera") >-1 && Boolean.TRUE.equals(method.invoke(homeDto))){
                   //gets the camera name from the method
                   String camName = method.getName().split("getCamera")[1].toUpperCase();
                   //if rover has the chosen camera, build the querystring accordingly
                   if (validCameras.get(homeDto.getMarsApiRoverData()).contains(camName)){
                       urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getSol()+"&api_key=" + API_KEY + "&camera=" + camName);
                   }
               }

            }
            return urls;

    }
}
