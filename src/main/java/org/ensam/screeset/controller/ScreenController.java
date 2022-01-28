package org.ensam.screeset.controller;

import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.dto.DataScreenRequestDTO;
import org.ensam.screeset.service.ScreenService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/screen")
public class ScreenController {
    @Autowired
    private ModelMapper modelMapper;
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
    @PutMapping(path="/heartbeat")
    public ResponseEntity<DataScreenRequestDTO> updateScreen (@RequestBody DataScreenRequestDTO dataScreenRequestDTO){
        Screen screenRequest=modelMapper.map(dataScreenRequestDTO,Screen.class);
        Screen screen = screenService.updateScreen(screenRequest);
        DataScreenRequestDTO screenReponse=modelMapper.map(screen ,DataScreenRequestDTO.class);
        return ResponseEntity.ok().body(screenReponse);
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
