package com.etoiledespoir.onlinekvshop.repository.OrderRepo;

import com.etoiledespoir.onlinekvshop.domain.order.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRep extends JpaRepository<OrderStatus,String> {
}
