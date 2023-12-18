package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Producto;
import com.ejercicio.Bazar2.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    //Autowired realiza la inyeccion de dependencias al objeto creado
    @Autowired
    private IProductoRepository prodRepo;

    @Override
    public void saveProducto(Producto prod) {
        prodRepo.save(prod);
    }

    @Override
    public List<Producto> getLista() {
        List<Producto> listaProd = prodRepo.findAll();
        return listaProd;
    }

    @Override
    public Producto getProducto(Long id) {
        Producto prod = prodRepo.findById(id).orElse(null);
        return prod;
    }

    @Override
    public void deleteProducto(Long id) {
        prodRepo.deleteById(id);
    }

    @Override
    public void editProd(Producto prod) {
        this.saveProducto(prod);
    }
    
    
    
    
}
