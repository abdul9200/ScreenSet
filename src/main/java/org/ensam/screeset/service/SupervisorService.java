package org.ensam.screeset.service;

import org.ensam.screeset.Entity.Supervisor;

import java.util.List;

public interface SupervisorService {
    Supervisor addSupervisor(Supervisor supervisor);
    void removeSupervisor(Supervisor supervisor);
    Supervisor updateSupervisor(Supervisor supervisor);
    List<Supervisor> listSupervisor();
}
