package com.ejercicio.Bazar2.controller;

import com.ejercicio.Bazar2.model.Cliente;
import com.ejercicio.Bazar2.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService cliServ;
    
     @PostMapping ("/Cliente/crearCli")
    public String saveProd (@RequestBody Cliente cli){
        cliServ.saveCliente(cli);
        return "Cliente creado correctamente";
    }
    
    @GetMapping ("/Cliente/traerListaCli")
    public List<Cliente> getCliente() {
        return cliServ.getListaCli();
    }
    
    @GetMapping ("/Cliente/traercli/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return cliServ.getCliente(id);
    }
    
    @DeleteMapping ("/Cliente/eliminarCli/{id}")
    public String deleteprod (@PathVariable Long id){
        cliServ.deleteCliente(id);
        return "Cliente eliminado";
    }
    
    //PathaVariable pasa info por http(poco seguro), RequestParam mas seguro
    @PostMapping ("/Cliente/editarCli")
    public Cliente editCliente (@RequestBody Cliente prod) {
        cliServ.editprod(prod);
        return cliServ.getCliente(prod.getId_Cliente());
    }
}
