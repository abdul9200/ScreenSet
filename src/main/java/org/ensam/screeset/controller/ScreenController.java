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
    public Screen addScreen(@RequestBody Screen screen){
        return screenService.addScreen(screen);
    }
    @PutMapping(path = "/addFileToScreen")
    public Screen addFileToScreen(@RequestParam(name = "idScreen")long idScreen, @RequestParam(name = "idFile")long idFile){
        System.out.println(idScreen+" "+idFile);
        return screenService.addFileToScreen(idScreen, idFile);
    }
    @PutMapping(path = "/update")
    public Screen updateScreen(@RequestBody Screen screen){
        return screenService.updateScreen(screen);
    }
    @DeleteMapping(path="/remove/{id}")
    public void removeScreen(@PathVariable(name ="id") long id){
        screenService.removeScreen(screenService.getScreenById(id));
    }
    @GetMapping(path="/listScreen")
    public List<Screen> listScreen(){
        return screenService.listScreen();
    }
}
