package com.etoiledespoir.onlinekvshop.service.size;

import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;
import com.etoiledespoir.onlinekvshop.repository.size.ItemSizeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ItemSizeService implements Iservice<ProductSize,String> {
    @Autowired
    private ItemSizeRepo itemSizeRepo;
    private static ItemSizeService itemSizeService;

    private ItemSizeService() {
    }
    public ItemSizeService getItemSizeService(){
        if(itemSizeService==null){
            itemSizeService=new ItemSizeService();
        }return itemSizeService;
    }

    @Override
    public ProductSize creat(ProductSize productSize) {
        return itemSizeRepo.save(productSize);
    }

    @Override
    public ProductSize delete(String id) {
        Optional<ProductSize> result=itemSizeRepo.findById(id);
        itemSizeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ProductSize Update(ProductSize productSize) {
        return itemSizeRepo.save(productSize);
    }

    @Override
    public ProductSize read(String id) {
        Optional<ProductSize> result=itemSizeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ProductSize> readAll() {
        return itemSizeRepo.findAll();
    }
    public List<ProductSize> productSizeList(String sizeId){
        List<ProductSize> productSizes=new ArrayList<>();
        for(ProductSize productSize:readAll()){
            if(productSize.getItemId().equals(sizeId)){
                productSizes.add(productSize);
            }
        }
        return productSizes;
    }
}
