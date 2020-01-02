package com.etoiledespoir.onlinekvshop.repository.OrderRepo;

import com.etoiledespoir.onlinekvshop.domain.order.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status,String> {
}
