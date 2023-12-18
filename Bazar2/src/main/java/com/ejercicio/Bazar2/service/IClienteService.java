package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    public void saveCliente(Cliente cli);
    
    public List<Cliente> getListaCli();
    
    public Cliente getCliente(Long id);
    
    public void deleteCliente(Long id);
    
    public void editprod(Cliente prod);
}
