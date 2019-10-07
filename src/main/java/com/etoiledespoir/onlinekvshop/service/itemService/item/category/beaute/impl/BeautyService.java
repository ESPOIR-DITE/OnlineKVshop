package com.etoiledespoir.onlinekvshop.service.itemService.item.category.beaute.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.repository.item.category.beaute.BeautyRepInt;
import com.etoiledespoir.onlinekvshop.repository.item.category.beaute.impl.BeautyRep;
import com.etoiledespoir.onlinekvshop.service.itemService.item.category.beaute.BeautyServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeautyService implements BeautyServiceInt {

    private static BeautyService beautyService=null;
    @Autowired
    BeautyRepInt beautyRepInt;

    private BeautyService() {
    }

    public BeautyService getBeautyService(){
        if(beautyService==null){
            beautyService=new BeautyService();
        }return beautyService;
    }

    @Override
    public BeautyMakeup creat(BeautyMakeup beautyMakeup) {
        Optional<BeautyMakeup>mybeaty=beautyRepInt.findById(beautyMakeup.getItemNumber());
        if(mybeaty==null) {
            return beautyRepInt.save(beautyMakeup);
        }
        return mybeaty.orElse(null);
    }

    @Override
    public BeautyMakeup delete(String id) {
        Optional<BeautyMakeup>mybeaty=beautyRepInt.findById(id);
        if(mybeaty!=null) {
            beautyRepInt.deleteById(id);
        }
        return mybeaty.orElse(null);
    }

    @Override
    public BeautyMakeup Update(BeautyMakeup beautyMakeup) {
        Optional<BeautyMakeup>mybeaty=beautyRepInt.findById(beautyMakeup.getItemNumber());
        if(mybeaty!=null) {
            beautyRepInt.save(beautyMakeup);
        }
        return mybeaty.orElse(null);
    }

    @Override
    public BeautyMakeup read(String id) {
        Optional<BeautyMakeup>mybeaty=beautyRepInt.findById(id);
        return mybeaty.orElse(null);
    }

    @Override
    public List<BeautyMakeup> readAll() {
        return beautyRepInt.findAll();
    }
}