package com.etoiledespoir.onlinekvshop.service.productType;

import com.etoiledespoir.onlinekvshop.domain.itemType.Types;
import com.etoiledespoir.onlinekvshop.repository.productType.TypeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypesService implements Iservice<Types,String> {
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
    public Types creat(Types types) {
        return typeRepo.save(types);
    }

    @Override
    public Types delete(String id) {
        Optional<Types>result=typeRepo.findById(id);
        typeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Types Update(Types types) {
        return typeRepo.save(types);
    }

    @Override
    public Types read(String id) {
        Optional<Types>result=typeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Types> readAll() {
        return typeRepo.findAll();
    }
}
