package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Producto;
import java.util.List;

public interface IProductoService {
    //metodo crear producto
    public void saveProducto(Producto prod);
    
    //metodo traer lista completa
    public List<Producto> getLista();
    
    //metodo traer un solo producto
    public Producto getProducto(Long cod_producto);
    
    //metodo eliminar producto
    public void deleteProducto(Long cod_producto);
    
    //metodo editar producto
   public void editProd(Producto prod);
}
