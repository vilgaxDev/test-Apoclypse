package com.vilgax.apocalypse.repository;

import com.vilgax.apocalypse.model.Robot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RobotRepository extends JpaRepository<Robot, Long > {
    List<Robot> findByCategory(String category);
}
