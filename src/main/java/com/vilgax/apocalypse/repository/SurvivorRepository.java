package com.vilgax.apocalypse.repository;

import com.vilgax.apocalypse.model.Survivor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurvivorRepository extends JpaRepository<Survivor, Long> {
    Survivor findByNationalIdNo(String nationalIdNo);
    List<Survivor> findByInfectionStatus(String infectionStatus);
}
