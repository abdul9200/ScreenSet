package org.ensam.screeset.service;

import org.ensam.screeset.Entity.Screen;
import org.ensam.screeset.Entity.Supervisor;
import org.ensam.screeset.repository.ScreenRepository;
import org.ensam.screeset.repository.SupervisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorServiceImpl implements SupervisorService {

    private SupervisorRepository repository;
    private ScreenRepository repS;

    public SupervisorServiceImpl(SupervisorRepository repository, ScreenRepository repS) {
        this.repository = repository;
        this.repS = repS;
    }

    @Override
    public Supervisor addSupervisor(Supervisor supervisor) {
        return repository.save(supervisor);
    }

    @Override
    public void removeSupervisor(Supervisor supervisor) {
        repository.delete(supervisor);
    }

    @Override
    public Supervisor updateSupervisor(Supervisor supervisor) {
        return repository.save(supervisor);
    }

    @Override
    public Supervisor getSupervisorById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Supervisor addScreenToSupervisor(long idSupervisor, long idScreen) {
        Supervisor supervisor = repository.findById(idSupervisor).get();
        Screen screen = repS.findById(idScreen).get();
        screen.setSupervisor(supervisor);
        supervisor.getScreens().add(screen);
        repS.save(screen);
        return repository.save(supervisor);
    }

    @Override
    public List<Supervisor> listSupervisor() {
        return repository.findAll();
    }
}
