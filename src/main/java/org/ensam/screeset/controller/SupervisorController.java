package org.ensam.screeset.controller;

import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.Entity.Supervisor;
import org.ensam.screeset.service.ScreenService;
import org.ensam.screeset.service.SupervisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/supervisor")
public class SupervisorController {
    private SupervisorService supervisorService;
    public SupervisorController(SupervisorService supervisorService){
        this.supervisorService=supervisorService;
    }
    @PostMapping(path = "/add")
    public Supervisor addSupervisor(Supervisor supervisor){

        return supervisorService.addSupervisor(supervisor);
    }
    @PutMapping(path = "/update/{id}")
    public Supervisor updateSupervisor(Supervisor supervisor){
        return supervisorService.updateSupervisor(supervisor);
    }
    @DeleteMapping(path = "/{id}")
    public void removeSupervisor(Supervisor supervisor){
        supervisorService.removeSupervisor(supervisor);
    }
    @GetMapping(path="/")
    public List<Supervisor> listSupervisor(){
        return supervisorService.listSupervisor();
    }
}
