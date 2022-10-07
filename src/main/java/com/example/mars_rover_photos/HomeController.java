package com.example.mars_rover_photos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap model){
        model.put("name", "Minnie Mouse");
        model.put("address", "123 Fake street");
        return "index";

    }

}
