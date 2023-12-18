package com.ejercicio.Bazar2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Venta {
    
    @Id
    private Long cod_vta;
    private LocalDate fecha_vta;
    private Double total;
    @OneToMany
    private List<Item> listaProd = new ArrayList<Item> ();
    @ManyToOne
    private Cliente cli;

    public Venta() {
        
    }
    
    public Venta(Long cod_vta, 
                 LocalDate fecha_vta,
                 Cliente cli) {
        this.cod_vta = cod_vta;
        this.fecha_vta = fecha_vta;
        this.cli = cli;
    }
    
    public void cargarItem(Item a){
        this.listaProd.add(a);
    }

}
