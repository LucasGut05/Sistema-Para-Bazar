package com.ejercicio.Bazar2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


//Entity transforma en tabla a la clase
@Entity
@Getter @Setter
public class Producto {
    //Id genera automaticamente un Id para cada objeto
    
    //Generated... en SEQUENCE hace q las Id generadas sean secuenciales
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Id
    private Long cod_producto;
    private String nombre;
    private String marca;
    private Double costo;
    private Double cant_disponible;

    public Producto() {
        
    }

    public Producto(Long cod_producto, 
                    String nombre, 
                    String marca, 
                    Double costo, 
                    Double cant_disponible) {
        this.cod_producto = cod_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cant_disponible = cant_disponible;
    }

}
