package com.ejercicio.Bazar2.controller;

import com.ejercicio.Bazar2.model.Producto;
import com.ejercicio.Bazar2.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService prodServ;
    
    //Creación: localhost:8080/productos/crear
    @PostMapping ("/producto/crearProd")
    public String saveProd (@RequestBody Producto prod){
        prodServ.saveProducto(prod);
        return "Producto creado correctamente";
    }
    
    //Lista completa de productos: localhost:8080/productos
    @GetMapping ("/producto/traerListaProd")
    public List<Producto> getProducto() {
        return prodServ.getLista();
    }
    
    //Traer un producto en particular: localhost:8080/productos/{codigo_producto}
    @GetMapping ("/Producto/traerProd/{id}")
    public Producto getProducto(@PathVariable Long id) {
        return prodServ.getProducto(id);
    }
    
    //Eliminación: localhost:8080/productos/eliminar/{codigo_producto}
    @DeleteMapping ("/producto/eliminarProd/{id}")
    public String deleteProd (@PathVariable Long id){
        prodServ.deleteProducto(id);
        return "Producto eliminado";
    }
    
    //Edición: localhost:8080/productos/editar/{codigo_producto}
    //PathaVariable pasa info por http(poco seguro), RequestParam mas seguro
    @PostMapping ("/producto/editar")
    public Producto editProducto (@RequestBody Producto prod) {
        prodServ.editProd(prod);
        return prodServ.getProducto(prod.getCod_producto());
    }
    
                    
                    
                    
}
