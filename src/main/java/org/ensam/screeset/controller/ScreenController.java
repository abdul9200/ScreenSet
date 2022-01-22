package org.ensam.screeset.controller;

import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.service.ScreenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/screen")
public class ScreenController {
    private ScreenService screenService;
    public ScreenController(ScreenService screenService){
        this.screenService=screenService;
    }
    @PostMapping(path = "/add")
    public Screen addScreen(Screen screen){

        return screenService.addScreen(screen);
    }
    @PutMapping(path = "/update")
    public Screen updateScreen(Screen screen){
        return screenService.updateScreen(screen);
    }
    @DeleteMapping
    public void removeScreen(Screen screen){
        screenService.removeScreen(screen);
    }
    @GetMapping(path="/")
    public List<Screen> listScreen(){
        return screenService.listScreen();
    }
}
