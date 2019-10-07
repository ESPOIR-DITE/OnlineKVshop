package com.etoiledespoir.onlinekvshop.repository.PaymentRepo;

import com.etoiledespoir.onlinekvshop.domain.payment.Payment;
import com.etoiledespoir.onlinekvshop.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpaymentInt extends JpaRepository<Payment,String> {

}
