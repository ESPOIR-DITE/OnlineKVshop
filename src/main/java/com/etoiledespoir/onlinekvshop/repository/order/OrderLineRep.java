package com.etoiledespoir.onlinekvshop.repository.order;

import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRep extends JpaRepository<OrderLine,String> {
}
