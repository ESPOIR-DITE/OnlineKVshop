package com.etoiledespoir.onlinekvshop.repository.item.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountingChangeRep extends JpaRepository<AccountChange,String> {
}
