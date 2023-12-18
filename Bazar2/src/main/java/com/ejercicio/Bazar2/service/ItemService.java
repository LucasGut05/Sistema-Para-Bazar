package com.ejercicio.Bazar2.service;

import com.ejercicio.Bazar2.model.Item;
import com.ejercicio.Bazar2.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService implements IItemService{
    //Autowired realiza la inyeccion de dependencias al objeto creado
    @Autowired
    private IItemRepository itemRepo;
    

    @Override
    public void saveItem(Item item) {
        itemRepo.save(item);
    }

    @Override
    public void deleteItem(Long cod_Item) {
    
        itemRepo.deleteById(cod_Item);
    }
    
    @Override
     public void editItem(Item id) {
        this.saveItem(id);
        
    }
     
     public Item getItem(Long id){
         Item Item = itemRepo.findById(id).orElse(null);
        return Item;
     }
     
     public String verifyItem(Long i){
         
         Item id = this.getItem(i);
         
        String rta;
        if( id.getProd().getCant_disponible()>=id.getCant()){
            
            id.getProd().setCant_disponible(id.getProd().getCant_disponible()-id.getCant());
            
            
            rta = "Stock suficiente. Stock disponible: " + id.getProd().getCant_disponible();
        }
        else{
            rta = "Stock insuficiente. Stock disponible: " + id.getProd().getCant_disponible();
            this.deleteItem(id.getCodItem());
        }
        return rta; 
    }
     
    
      
}
