package com.example.mars_rover_photos.web;

import com.example.mars_rover_photos.dto.HomeDto;
import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.service.MarsRoverAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import java.lang.reflect.InvocationTargetException;

@Controller
public class HomeController {
    private final MarsRoverAPIService roverService;

    public HomeController(MarsRoverAPIService roverService) {
        this.roverService = roverService;
    }

    @GetMapping("/")
    public String home(ModelMap model, Long userId) throws InvocationTargetException, IllegalAccessException {

        HomeDto homeDto = createDefaultHomeDto();

        if (userId == null){
            homeDto = roverService.save(homeDto);
        } else {
            homeDto = roverService.findByUserId(userId);
        }

        ApiResponseRoverPhotos roverData = roverService.getRoverData(homeDto);
        model.put("roverData", roverData);
        model.put("homeDto", homeDto);
        model.put("validCameras", roverService.getValidCameras().get(homeDto.getMarsApiRoverData()));

        return "index";
    }

    private HomeDto createDefaultHomeDto() {
        HomeDto homeDto = new HomeDto();
        homeDto.setMarsApiRoverData("Opportunity");
        homeDto.setSol(1);
        return homeDto;
    }

    @PostMapping("/")
    public String postHomeView (HomeDto homeDto){
        if (Boolean.TRUE.equals(homeDto.getRememberPreferences())){
            homeDto = roverService.save(homeDto);
        } else {
            homeDto = createDefaultHomeDto();

        }
        homeDto = roverService.save(homeDto);
        return "redirect:/?userId="+homeDto.getUserId();
    }

}
