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
    @PutMapping(path = "/addScreenToSupervisor")
    public Supervisor addScreenToSupervisor(@RequestParam(name = "idSupervisor")long idSupervisor, @RequestParam(name = "idScreen")long idScreen){
        return supervisorService.addScreenToSupervisor(idSupervisor, idScreen);
    }
    @PutMapping(path = "/update")
    public Supervisor updateSupervisor(@RequestBody Supervisor supervisor){
        return supervisorService.updateSupervisor(supervisor);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeSupervisor(@PathVariable(name = "id") long id){
        supervisorService.removeSupervisor(supervisorService.getSupervisorById(id));
    }
    @GetMapping(path="/listSupervisor")
    public List<Supervisor> listSupervisor(){
        return supervisorService.listSupervisor();
    }
}
