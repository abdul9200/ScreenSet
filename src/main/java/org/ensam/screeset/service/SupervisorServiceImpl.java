package org.ensam.screeset.service;

import org.ensam.screeset.Entity.Supervisor;
import org.ensam.screeset.repository.SupervisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorServiceImpl implements SupervisorService {

    private SupervisorRepository repository;

    public SupervisorServiceImpl(SupervisorRepository repository) {
        this.repository = repository;
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
    public List<Supervisor> listSupervisor() {
        return repository.findAll();
    }
}
