package com.ejercicio.Bazar2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
    
    @Id
    private Long id_Cliente;
    private String nombre_Cli;
    private String Ape_Cli;
    private String DNI;

    public Cliente() {
        
    }

    public Cliente(Long id_Cliente, 
                   String nombre_Cli, 
                   String Ape_Cli, 
                   String DNI) {
        this.id_Cliente = id_Cliente;
        this.nombre_Cli = nombre_Cli;
        this.Ape_Cli = Ape_Cli;
        this.DNI = DNI;
    }
    
    
    
    
}
