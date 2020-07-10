package com.etoiledespoir.onlinekvshop.controller.user.address;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.user.address.AddressType;
import com.etoiledespoir.onlinekvshop.factory.domain.user.address.AddressTypeFact;
import com.etoiledespoir.onlinekvshop.service.user.address.AddressTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OKVS/addressType")
public class AddressTypeController implements Icontroller<AddressType,String > {
    @Autowired
    AddressTypeService addressTypeService;
    @PostMapping("/create")
    @Override
    public AddressType create(@RequestBody AddressType addressType) {
        AddressType addressType1= AddressTypeFact.getAddresType(addressType.getAddressType());
        System.out.println(addressType1.toString());
        return addressTypeService.creat(addressType1);
    }

    @GetMapping("/read")
    @Override
    public AddressType read(@RequestParam("id") String id) {
        return addressTypeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public AddressType update(@RequestBody AddressType addressType) {
        return addressTypeService.Update(addressType);
    }

    @GetMapping("/delete")
    @Override
    public AddressType delete(@RequestParam("id") String id) {
        return addressTypeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<AddressType> readAll() {
        return addressTypeService.readAll();
    }

    @GetMapping("/readwithType")
    public AddressType readWithAddressType(@RequestParam("id") String type){
        return addressTypeService.readWithAddressType(type);
    }
}
