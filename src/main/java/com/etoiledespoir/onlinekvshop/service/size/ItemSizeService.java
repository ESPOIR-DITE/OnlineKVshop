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
        if(read(id).getItemId()!=null){
            itemSizeRepo.deleteById(id);
        }
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

    public ProductSize readWithItemId(String itemId){
        for(ProductSize productSize:readAll()){
            if(productSize.getItemId().equals(itemId)){
                return productSize;
            }
        }
        return null;
    }
    public List<ProductSize> productSizeList(String itemId){
        List<ProductSize> productSizes=new ArrayList<>();
        for(ProductSize productSize:readAll()){
            if(productSize.getItemId().equals(itemId)){
                productSizes.add(productSize);
            }
        }
        return productSizes;
    }

    public Boolean deleteAllOf(String itemId){
        Boolean result= false;
        for (ProductSize sizeId:readAll()){
            if (sizeId.getItemId().equals(itemId)){
                ProductSize productSize1=delete(sizeId.getId());
                if (productSize1!=null){
                    result= true;
                }
            }
        }return result;
    }
    public Boolean createAll(ArrayList<ProductSize> productSize){
        boolean toreturn= false;
        for (ProductSize ps:productSize){
            System.out.println(ps);
            if(ps!=null){
                ProductSize result=creat(ps);
                if (result!=null){
                    toreturn=true;
                }
            }
        }return toreturn;
    }
}
