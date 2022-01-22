package org.ensam.screeset.repository;

import org.ensam.screeset.Entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long>{

}
