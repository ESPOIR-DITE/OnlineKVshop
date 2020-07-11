package com.etoiledespoir.onlinekvshop.service.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.Brand;
import com.etoiledespoir.onlinekvshop.repository.item.braind.BraindRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BrandService implements Iservice<Brand,String> {
    @Autowired
    private BraindRep braindRep;
    private static BrandService brandService;

    private BrandService() {
    }
    public static BrandService getBrandService(){
        if(brandService ==null){
            brandService =new BrandService();
        }return brandService;
    }

    @Override
    public Brand creat(Brand brand) {
        return braindRep.save(brand);
    }

    @Override
    public Brand delete(String id) {
        Optional<Brand> result=braindRep.findById(id);
        braindRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Brand Update(Brand brand) {
        return braindRep.save(brand);
    }

    @Override
    public Brand read(String id) {
        Optional<Brand> result=braindRep.findById(id);
        return result.orElse(null);
    }
    public Brand readWithName(String name) {
       List<Brand> result=braindRep.findAll();
       for(Brand brand : result){
           if(brand.getBrandName().equals(name)){
               return brand;
           }
       }
        return null;
    }

    @Override
    public List<Brand> readAll() {
        return braindRep.findAll();
    }
}
