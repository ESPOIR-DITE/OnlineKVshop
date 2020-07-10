package com.etoiledespoir.onlinekvshop.controller.user.address;


import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.user.address.UserAddress;
import com.etoiledespoir.onlinekvshop.factory.domain.user.address.AddressFactory;
import com.etoiledespoir.onlinekvshop.service.user.address.UserAddressService;
import com.etoiledespoir.onlinekvshop.service.user.address.AddressTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/address")
public class UserAddressController implements Icontroller<UserAddress, String> {
    @Autowired
    UserAddressService userAddressService;
    @Autowired
    AddressTypeService addressTypeService;

    @PostMapping("/create")
    public UserAddress creat(@RequestBody UserAddress ad) {
        UserAddress userAddress= AddressFactory.getAddress(ad.getUserId(),ad.getAddress(),ad.getAddressType(),ad.getPhoneNumber());
        if(userAddress!=null) {
            UserAddress myAddress = userAddressService.creat(userAddress);
            return myAddress;
        }
        return null;
    }

    @Override
    public UserAddress create(UserAddress address) {
        return null;
    }

    @GetMapping("/read")
    @Override
    public UserAddress read(@RequestParam("id") String id) {
        return userAddressService.read(id);
    }

    @PostMapping("/update")
    @Override
    public UserAddress update(@RequestBody UserAddress address) {
        return userAddressService.Update(address);
    }

    @GetMapping("/delete")
    @Override
    public UserAddress delete(@RequestParam("id") String id) {
        return userAddressService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<UserAddress> readAll() {
        return userAddressService.readAll();
    }


}
