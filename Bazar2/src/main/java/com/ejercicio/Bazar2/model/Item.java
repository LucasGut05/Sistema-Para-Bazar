package com.ejercicio.Bazar2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Item {
    @Id
    private Long codItem;
    @ManyToOne
    private Producto prod;
    private Long cant;

    public Item(Long codItem, 
                Producto prod, 
                Long cant) {
        this.codItem = codItem;
        this.prod = prod;
        this.cant = cant;
    }

    public Item() {
        
    }

    
}
