package com.ejercicio.Bazar2.repository;

import com.ejercicio.Bazar2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Se extiende de JpaRepository para utilizar todos los métodos que ofrece
//para JPA. <Clase a mapear, tipo de dato de ID>
@Repository
public interface IProductoRepository extends JpaRepository <Producto,Long> {
    
}
