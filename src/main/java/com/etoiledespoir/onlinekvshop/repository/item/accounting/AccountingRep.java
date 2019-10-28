package com.etoiledespoir.onlinekvshop.repository.item.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountingRep extends JpaRepository<Accounting,String> {
}
