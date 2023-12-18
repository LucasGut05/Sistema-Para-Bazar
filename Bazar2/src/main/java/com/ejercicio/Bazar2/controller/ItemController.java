package com.ejercicio.Bazar2.controller;

import com.ejercicio.Bazar2.model.Item;
import com.ejercicio.Bazar2.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ItemController {
    
      @Autowired
    private IItemService itemServ;
      
    //Creación: localhost:8080/productos/crear
    @PostMapping ("/item/crearItem")
    public String saveItem (@RequestBody Item i){
        itemServ.saveItem(i);
        return "Item creado correctamente";
    }
    
    //Eliminación: localhost:8080/productos/eliminar/{codigo_producto}
    @DeleteMapping ("/Item/eliminarItem/{id}")
    public String deleteItem (@PathVariable Long id){
        itemServ.deleteItem(id);
        return "Item eliminado";
    }
    
    //Edición: localhost:8080/productos/editar/{codigo_producto}
    //PathaVariable pasa info por http(poco seguro), RequestParam mas seguro
    @PostMapping ("/Item/editar")
    public Item editItem (@RequestBody Item item) {
        itemServ.editItem(item);
        return itemServ.getItem(item.getCodItem());
    }
    
    //Traer un producto en particular: localhost:8080/productos/{codigo_producto}
    @GetMapping ("/Item/traerItem/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemServ.getItem(id);
    }
    
    //arreglar esto que no devuelve nada
    @PostMapping ("/Item/verifyItem/{i}") 
    public String verifyItem (@PathVariable Long i){
        return itemServ.verifyItem(i);
    }
}
