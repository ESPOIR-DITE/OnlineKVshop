package com.etoiledespoir.onlinekvshop.controller.user.Demography;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.Demography.Address;
import com.etoiledespoir.onlinekvshop.domain.users.Demography.helper.AddressHelper;
import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import com.etoiledespoir.onlinekvshop.factory.domain.address.AddressFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.bridge.CustomerBridgeFactory;
import com.etoiledespoir.onlinekvshop.repository.user.Demography.AddressRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.user.Demography.impl.AddressService;
import com.etoiledespoir.onlinekvshop.service.user.bridge.impl.CustomerBridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/OKVS/address")
public class AddressController implements Icontroller<Address, String> {
    @Autowired
    AddressService addressService;
    @Autowired
    CustomerBridgeService customerBridgeService;


    CustomerBridge csutB0=null;



    /**
     * this method is creating a new address for an existing customer
     * first we create an address
     * we take the id of that address and create the bridge table
     * @param
     * @param
     * @return
     */
    @PostMapping("/create")
    public Address create(@RequestBody AddressHelper ad) {

        Address address1= AddressFactory.getAddress(ad.getCommun(),ad.getQuartier(),ad.getAvenue(),ad.getNumero());
        Address myAddress=addressService.creat(address1);

        CustomerBridge custB1=customerBridgeService.readWithEmail(ad.getEmail());
        if(custB1==null){
            //System.out.println(custB1.toString());
            csutB0= CustomerBridgeFactory.getCustomerBridge(ad.getEmail(),myAddress.getId(),"");
            customerBridgeService.creat(csutB0);
            return myAddress;
        }
        else if(custB1!=null){
          csutB0= CustomerBridgeFactory.updateCustomerBridge(custB1.getId(),ad.getEmail(),myAddress.getId(),custB1.getGenderId());
        customerBridgeService.creat(csutB0);
            return myAddress;
        }
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

    @Override
    public Address create(Address address) {
        return null;
    }
}
