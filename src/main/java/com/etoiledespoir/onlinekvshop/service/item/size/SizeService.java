package com.etoiledespoir.onlinekvshop.service.item.size;

import com.etoiledespoir.onlinekvshop.domain.item.size.Size;
import com.etoiledespoir.onlinekvshop.repository.item.size.SizeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeService implements Iservice<Size,String> {
    @Autowired
    private SizeRepo sizeRepo;
    private static SizeService sizeService;

    private SizeService() {
    }
    public static SizeService getSizeService(){
        if(sizeService==null){
            sizeService=new SizeService();
        }return sizeService;
    }

    @Override
    public Size creat(Size size) {
        return sizeRepo.save(size);
    }

    @Override
    public Size delete(String id) {
        Optional<Size> result=sizeRepo.findById(id);
        sizeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Size Update(Size size) {
        return sizeRepo.save(size);
    }

    @Override
    public Size read(String id) {
        Optional<Size> result=sizeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Size> readAll() {
        return sizeRepo.findAll();
    }

}
