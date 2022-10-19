package com.example.mars_rover_photos.web;

import com.example.mars_rover_photos.dto.HomeDto;
import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.service.MarsRoverAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.thymeleaf.util.StringUtils;

import java.lang.reflect.InvocationTargetException;

@Controller
public class HomeController {
    private final MarsRoverAPIService roverService;

    public HomeController(MarsRoverAPIService roverService) {
        this.roverService = roverService;
    }

    @GetMapping("/")
    public String home(ModelMap model, HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {
        //set default value if request param is empty
        if (StringUtils.isEmpty(homeDto.getMarsApiRoverData())){
            homeDto.setMarsApiRoverData("Curiosity");
        }
        if (homeDto.getSol() == null){
            homeDto.setSol(1);
        }
        ApiResponseRoverPhotos roverData = roverService.getRoverData(homeDto);
        model.put("roverData", roverData);
        model.put("homeDto", homeDto);
        return "index";
    }

}
