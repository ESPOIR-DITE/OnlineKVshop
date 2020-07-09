package com.etoiledespoir.onlinekvshop.service.item.special.type;

import com.etoiledespoir.onlinekvshop.domain.item.specials.type.SpecialType;
import com.etoiledespoir.onlinekvshop.repository.item.special.ItemSpecialTypeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialTypeService implements Iservice<SpecialType,String> {
    private static SpecialTypeService specialTypeService;
    @Autowired
    ItemSpecialTypeRepo itemSpecialTypeRepo;

    private SpecialTypeService() {
    }

    public static SpecialTypeService getSpecialTypeService(){
        if(specialTypeService==null){
            specialTypeService=new SpecialTypeService();
        }return specialTypeService;
    }
    @Override
    public SpecialType creat(SpecialType specialType) {
        return itemSpecialTypeRepo.save(specialType);
    }

    @Override
    public SpecialType delete(String id) {
        Optional<SpecialType> result=itemSpecialTypeRepo.findById(id);
        itemSpecialTypeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public SpecialType Update(SpecialType specialType) {
        SpecialType specialType1=read(specialType.getId());
        if(specialType1!=null) {
            delete(specialType.getId());
            return itemSpecialTypeRepo.save(specialType);
        }
        return null;
    }

    @Override
    public SpecialType read(String id) {
        Optional<SpecialType> result=itemSpecialTypeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<SpecialType> readAll() {
        return itemSpecialTypeRepo.findAll();
    }
}
