package com.etoiledespoir.onlinekvshop.repository.user.contact.type;

import com.etoiledespoir.onlinekvshop.domain.users.contact.impl.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactTypeRep extends JpaRepository<ContactType,String> {
}
