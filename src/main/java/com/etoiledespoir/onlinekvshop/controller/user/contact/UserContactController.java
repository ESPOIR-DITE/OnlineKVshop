package com.etoiledespoir.onlinekvshop.controller.user.contact;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.user.contact.UserContact;
import com.etoiledespoir.onlinekvshop.factory.domain.contact.UserContactFactory;
import com.etoiledespoir.onlinekvshop.service.user.contact.UserContactService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/userContact")
public class UserContactController implements Icontroller<UserContact,String> {
    @Autowired
    private UserContactService userContactService;

    @PostMapping("create")
    @Override
    public UserContact create(@RequestBody UserContact userContact) throws UnirestException {
        UserContact userContact1 = UserContactFactory.getUserContact(userContact.getContactTypeId(),userContact.getContact());
        return userContactService.creat(userContact1);
    }

    @GetMapping("read")
    @Override
    public UserContact read(@RequestParam("id") String id) {
        return userContactService.read(id);
    }

    @PostMapping("update")
    @Override
    public UserContact update(@RequestBody UserContact userContact) {
        return userContactService.Update(userContact);
    }

    @GetMapping("delete")
    @Override
    public UserContact delete(@RequestParam("id") String id) {
        return userContactService.delete(id);
    }

    @GetMapping("reads")
    @Override
    public List<UserContact> readAll() {
        return userContactService.readAll();
    }
}
