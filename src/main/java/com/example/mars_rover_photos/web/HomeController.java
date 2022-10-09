package com.example.mars_rover_photos.web;

import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.service.MarsRoverAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private final MarsRoverAPIService roverService;

    public HomeController(MarsRoverAPIService roverService) {
        this.roverService = roverService;
    }

    @GetMapping("/")
    public String home(ModelMap model){
        ApiResponseRoverPhotos roverData = roverService.getRoverData("curiosity");
        model.put("roverData", roverData);
        return "index";
    }

    @PostMapping("/")
    public String postHomeView(ModelMap model, @RequestParam String marsApiRoverData){
        ApiResponseRoverPhotos roverData = roverService.getRoverData(marsApiRoverData);
        model.put("roverData", roverData);
        return "index";
    }

}
