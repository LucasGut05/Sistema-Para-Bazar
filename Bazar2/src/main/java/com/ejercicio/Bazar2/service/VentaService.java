package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Item;
import com.ejercicio.Bazar2.model.Venta;
import com.ejercicio.Bazar2.repository.IVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    
    @Autowired
    private IVentaRepository vtaRepo;

    @Override
    public void saveVenta(Venta vta) {
        vtaRepo.save(vta);
    }

    @Override
    public List<Venta> getLista() {
        List<Venta> listaVta = vtaRepo.findAll();
        return listaVta;
    }

    @Override
    public Venta getVenta(Long id) {
        Venta vta = vtaRepo.findById(id).orElse(null);
        return vta;
    }

    @Override
    public void deleteVenta(Long id) {
        vtaRepo.deleteById(id);
    }

    @Override
    public void editVta(Venta vta) {
        this.saveVenta(vta);
    } 
    
    @Override
    public void saveItem(Long id, Item i) {
        Venta vta = this.getVenta(id);
        vta.cargarItem(i);      
        vtaRepo.save(vta);
    }
    
    @Override
    public void calTot(Long id) {
        Venta vta = this.getVenta(id);
        Double tot = 0.0;
        for(int i =0; i<vta.getListaProd().size();i++){
            tot = tot + (vta.getListaProd().get(i).getCant()*vta.getListaProd().get(i).getProd().getCosto());
        }
        vta.setTotal(tot);
        this.saveVenta(vta);
    } 
    
        
}



    
    

    

