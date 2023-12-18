package com.ejercicio.Bazar2.controller;

import com.ejercicio.Bazar2.model.Item;
import com.ejercicio.Bazar2.model.Venta;
import com.ejercicio.Bazar2.service.IVentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {
     @Autowired
    private IVentaService vtaServ;
     
     
      //VENTACONTROLLER
    @PostMapping ("/Venta/crearVta")
    public String saveProd (@RequestBody Venta vta){
        vtaServ.saveVenta(vta);
        return "Venta creado correctamente";
    }
    
    @GetMapping ("/Venta/traerListaVta")
    public List<Venta> getListaVta() {
        return vtaServ.getLista();
    }
    
    @GetMapping ("/Venta/traerVta/{id}")
    public Venta getVenta(@PathVariable Long id) {
        return vtaServ.getVenta(id);
    }
    
    @DeleteMapping ("/Venta/eliminarVta/{id}")
    public String deleteProd (@PathVariable Long id){
        vtaServ.deleteVenta(id);
        return "Venta eliminado";
    }
    
    //PathaVariable pasa info por http(poco seguro), RequestParam mas seguro
    @PostMapping ("/Venta/editarVta")
    public Venta editVenta (@RequestBody Venta vta) {
        vtaServ.editVta(vta);
        return vtaServ.getVenta(vta.getCod_vta());
    }
    
    //arreglar esto que no devuelve nada
    @PostMapping ("/Venta/saveItem/{id_vta}") 
    public String saveItem (@PathVariable Long id_vta,  
                            @RequestBody Item i){
        vtaServ.saveItem(id_vta, i);
        return "Item agregado correctamente";
    }
    
    
    @PostMapping ("/Venta/total/{id}")
    public String tot (@PathVariable Long id){
        vtaServ.calTot(id);
        return "Se actualizó el total";
    }
    
    
}


