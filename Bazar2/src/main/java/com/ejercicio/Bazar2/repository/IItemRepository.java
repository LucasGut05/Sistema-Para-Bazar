package com.ejercicio.Bazar2.repository;

import com.ejercicio.Bazar2.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepository extends JpaRepository<Item, Long> {
    
}
