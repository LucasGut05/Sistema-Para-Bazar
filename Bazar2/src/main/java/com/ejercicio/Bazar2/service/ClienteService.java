package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Cliente;
import com.ejercicio.Bazar2.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    private IClienteRepository cliRepo;

    @Override
    public void saveCliente(Cliente cli) {
        cliRepo.save(cli);
    }

    @Override
    public List<Cliente> getListaCli() {
        List<Cliente> listaCli = cliRepo.findAll();
        return listaCli;
    }

    @Override
    public Cliente getCliente(Long id) {
        Cliente cli = cliRepo.findById(id).orElse(null);
        return cli;
    }

    @Override
    public void deleteCliente(Long id) {
        cliRepo.deleteById(id);
    }

    @Override
    public void editprod(Cliente cli) {
        this.saveCliente(cli);
    }
    
    
}
