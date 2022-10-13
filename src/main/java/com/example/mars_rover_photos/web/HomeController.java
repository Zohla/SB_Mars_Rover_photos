package com.example.mars_rover_photos.web;

import com.example.mars_rover_photos.response.ApiResponseRoverPhotos;
import com.example.mars_rover_photos.service.MarsRoverAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class HomeController {
    private final MarsRoverAPIService roverService;

    public HomeController(MarsRoverAPIService roverService) {
        this.roverService = roverService;
    }

    @GetMapping("/")
    public String home(ModelMap model, @RequestParam(required = false) String marsApiRoverData,
                       @RequestParam(required = false) Integer sol){
        //set default value if request param is empty
        if (StringUtils.isEmpty(marsApiRoverData)){
            marsApiRoverData = "spirit";
        }
        if (sol == null){
            sol = 1;
        }
        ApiResponseRoverPhotos roverData = roverService.getRoverData(marsApiRoverData, sol);
        model.put("roverData", roverData);
        return "index";
    }

   /* @PostMapping("/")
    public String postHomeView(ModelMap model, ){
        ApiResponseRoverPhotos roverData = roverService.getRoverData(marsApiRoverData);
        model.put("roverData", roverData);
        return "index";
    }*/

}
