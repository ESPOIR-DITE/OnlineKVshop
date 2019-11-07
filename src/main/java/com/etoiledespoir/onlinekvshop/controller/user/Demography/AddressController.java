package com.etoiledespoir.onlinekvshop.controller.user.Demography;


import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.address.AddressType;
import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import com.etoiledespoir.onlinekvshop.factory.domain.address.AddressFactory;
import com.etoiledespoir.onlinekvshop.service.address.AddressService;
import com.etoiledespoir.onlinekvshop.service.address.impl.AddressTypeService;
import com.etoiledespoir.onlinekvshop.service.gender.CustGenderService;
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
    @Override
    public Address create(@RequestBody Address ad) {

        String addressTypeid=addressTypeService.readWithAddressType(ad.getAddressType());
        if(addressTypeid!=null){
        Address address1= AddressFactory.getAddress(ad.getId(),addressTypeid,ad.getCommun(),ad.getQuartier(),ad.getAvenue(),ad.getNumero());
        if(address1!=null){
            Address myAddress=addressService.creat(address1);

            return myAddress;
                    }
        }

        return null;
    }

    @GetMapping("/read")
    @Override
    public Address read(@RequestParam("id") String id) {
        Address ad=addressService.read(id);
        if(ad!=null) {
            String addressTypeid = addressTypeService.readWithAddressType(ad.getAddressType());
            Address address1 = AddressFactory.getAddress(ad.getId(), addressTypeid, ad.getCommun(), ad.getQuartier(), ad.getAvenue(), ad.getNumero());
            return address1;
        }
        return null;
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
