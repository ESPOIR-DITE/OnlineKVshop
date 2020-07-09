package com.etoiledespoir.onlinekvshop.controller.user.address;


import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.address.AddressHelper;
import com.etoiledespoir.onlinekvshop.domain.users.address.Address;
import com.etoiledespoir.onlinekvshop.factory.domain.user.address.AddressFactory;
import com.etoiledespoir.onlinekvshop.service.user.address.AddressService;
import com.etoiledespoir.onlinekvshop.service.user.address.AddressTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/address")
public class AddressController implements Icontroller<Address, String> {
    @Autowired
    AddressService addressService;
    @Autowired
    AddressTypeService addressTypeService;

    @PostMapping("/create")
    public Address creat(@RequestBody AddressHelper ad) {
        String addressTypeid=addressTypeService.readWithAddressType(ad.getAddressType()).getAddressTypeId();
        Address address1= AddressFactory.getAddress(ad.getUserId(),ad.getAddress(),addressTypeid,ad.getPhoneNumber());
        if(address1!=null) {
            Address myAddress = addressService.creat(address1);
            return myAddress;
        }
        return null;
    }

    @Override
    public Address create(Address address) {
        return null;
    }

    @GetMapping("/read")
    @Override
    public Address read(@RequestParam("id") String id) {
        return addressService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Address update(@RequestBody Address address) {
        return addressService.Update(address);
    }

    @GetMapping("/delete")
    @Override
    public Address delete(@RequestParam("id") String id) {
        return addressService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Address> readAll() {
        return addressService.readAll();
    }


}
