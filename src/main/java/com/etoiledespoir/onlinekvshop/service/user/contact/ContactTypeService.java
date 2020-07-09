package com.etoiledespoir.onlinekvshop.service.user.contact;

import com.etoiledespoir.onlinekvshop.domain.users.contact.ContactType;
import com.etoiledespoir.onlinekvshop.repository.user.contact.ContactTypeRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactTypeService implements Iservice<ContactType,String> {
    @Autowired
    private ContactTypeRep contactTypeRep;
    private static ContactTypeService contactTypeService;
    @Override
    public ContactType creat(ContactType contactType) {
        return contactTypeRep.save(contactType);
    }

    @Override
    public ContactType delete(String id) {
        Optional<ContactType> result=contactTypeRep.findById(id);
        contactTypeRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ContactType Update(ContactType contactType) {
        return contactTypeRep.save(contactType);
    }

    @Override
    public ContactType read(String id) {
        Optional<ContactType> result=contactTypeRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ContactType> readAll() {
        return contactTypeRep.findAll();
    }
}
