package org.ensam.screeset.service;

import org.ensam.screeset.Entity.Supervisor;

import java.util.List;

public interface SupervisorService {
    Supervisor addSupervisor(Supervisor supervisor);
    void removeSupervisor(Supervisor supervisor);
    Supervisor updateSupervisor(Supervisor supervisor);
    Supervisor getSupervisorById(long id);
    Supervisor addScreenToSupervisor(long idSupervisor, long idScreen);
    List<Supervisor> listSupervisor();
}
