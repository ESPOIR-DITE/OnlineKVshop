package com.etoiledespoir.onlinekvshop.repository.user.contact;

import com.etoiledespoir.onlinekvshop.domain.user.contact.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactTypeRep extends JpaRepository<ContactType,String> {
}
