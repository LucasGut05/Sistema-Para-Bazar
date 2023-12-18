package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Item;
import com.ejercicio.Bazar2.model.Venta;
import java.util.List;

public interface IVentaService {
    //metodo crear producto
    public void saveVenta(Venta vta);
    
    //metodo traer lista completa
    public List<Venta> getLista();
    
    //metodo traer un solo producto
    public Venta getVenta(Long cod_vta);
    
    //metodo eliminar producto
    public void deleteVenta(Long cod_vta);
    
    //metodo editar producto
    public void editVta(Venta vta);
    
    //metodo calcular total
    public void calTot(Long id);
    
    public void saveItem(Long id, Item i);
    
    
}




    


