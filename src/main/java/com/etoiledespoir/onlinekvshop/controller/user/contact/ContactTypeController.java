package com.etoiledespoir.onlinekvshop.controller.user.contact;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.contact.ContactType;
import com.etoiledespoir.onlinekvshop.factory.domain.contact.ContactTypeFactory;
import com.etoiledespoir.onlinekvshop.service.user.contact.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OKVS/contactType")
public class ContactTypeController implements Icontroller<ContactType,String> {
    @Autowired
    ContactTypeService contactTypeService;

    @PostMapping("/create")
    @Override
    public ContactType create(@RequestBody ContactType contactType) {

        ContactType contactType1= ContactTypeFactory.getContactType(contactType.getType());
        return contactTypeService.creat(contactType1);
    }

    @GetMapping("/read")
    @Override
    public ContactType read(@RequestParam("id") String id) {
        return contactTypeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public ContactType update(@RequestBody ContactType contactType) {
        return contactTypeService.Update(contactType);
    }

    @GetMapping("/delete")
    @Override
    public ContactType delete(@RequestParam("id") String id) {
        return contactTypeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<ContactType> readAll() {
        return contactTypeService.readAll();
    }
}
