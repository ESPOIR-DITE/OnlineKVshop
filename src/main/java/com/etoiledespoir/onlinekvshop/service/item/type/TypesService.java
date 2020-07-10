package com.etoiledespoir.onlinekvshop.service.item.type;

import com.etoiledespoir.onlinekvshop.domain.item.itemType.TypeOfItem;
import com.etoiledespoir.onlinekvshop.repository.item.productType.TypeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypesService implements Iservice<TypeOfItem,String> {
    @Autowired
    private TypeRepo typeRepo;
    private static TypesService typesService;

    private TypesService() {
    }
    public static TypesService getTypesService(){
        if(typesService==null){
            typesService=new TypesService();
        }return typesService;
    }

    @Override
    public TypeOfItem creat(TypeOfItem typeOfItem) {
        return typeRepo.save(typeOfItem);
    }

    @Override
    public TypeOfItem delete(String id) {
        Optional<TypeOfItem>result=typeRepo.findById(id);
        typeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public TypeOfItem Update(TypeOfItem typeOfItem) {
        return typeRepo.save(typeOfItem);
    }

    @Override
    public TypeOfItem read(String id) {
        Optional<TypeOfItem>result=typeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<TypeOfItem> readAll() {
        return typeRepo.findAll();
    }
}
