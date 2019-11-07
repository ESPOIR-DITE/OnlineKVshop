package com.etoiledespoir.onlinekvshop.repository.user.contact;

import com.etoiledespoir.onlinekvshop.domain.users.contact.CustomerContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactRep extends JpaRepository<CustomerContact,String> {
}
