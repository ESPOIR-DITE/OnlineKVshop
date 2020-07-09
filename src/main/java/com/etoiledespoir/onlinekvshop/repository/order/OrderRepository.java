package com.etoiledespoir.onlinekvshop.repository.order;

import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders,String> {

}
