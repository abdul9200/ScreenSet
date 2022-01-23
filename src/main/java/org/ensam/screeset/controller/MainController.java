package org.ensam.screeset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(path = "home")
    public String home(){
        return "home";
    }
}
