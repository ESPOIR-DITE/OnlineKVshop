package com.etoiledespoir.onlinekvshop.repository.OrderRepo;

import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iorder extends JpaRepository<Orders,String> {

}
