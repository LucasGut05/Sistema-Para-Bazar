package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Item;


public interface IItemService {
    //metodo crear Item
    public void saveItem(Item item);
    
    //metodo eliminar Item
    public void deleteItem(Long cod_Item);
    
    //metodo editar Item
    public void editItem(Item id);
   
    //metodo editar Item
    public Item getItem(Long id);
    
    public String verifyItem(Long i);
}
