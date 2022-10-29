package com.vilgax.apocalypse.repository;

import com.vilgax.apocalypse.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
