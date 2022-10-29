package com.vilgax.apocalypse.repository;

import com.vilgax.apocalypse.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
