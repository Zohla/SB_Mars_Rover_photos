package com.example.mars_rover_photos.web;

import com.example.mars_rover_photos.dto.HomeDto;
import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.service.MarsRoverAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class HomeController {
    private final MarsRoverAPIService roverService;

    public HomeController(MarsRoverAPIService roverService) {
        this.roverService = roverService;
    }

    @GetMapping("/")
    public String home(ModelMap model, HomeDto homeDto) {
        //set default value if request param is empty
        if (StringUtils.isEmpty(homeDto.getMarsApiRoverData())){
            homeDto.setMarsApiRoverData("curiosity");
        }
        if (homeDto.getSol() == null){
            homeDto.setSol(1);
        }
        ApiResponseRoverPhotos roverData = roverService.getRoverData(homeDto.getMarsApiRoverData(), homeDto.getSol());
        model.put("roverData", roverData);
        model.put("homeDto", homeDto);
        return "index";
    }

}
