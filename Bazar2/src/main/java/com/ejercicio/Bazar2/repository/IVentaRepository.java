package com.ejercicio.Bazar2.repository;

import com.ejercicio.Bazar2.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository <Venta, Long> {
    
}
