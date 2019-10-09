package com.etoiledespoir.onlinekvshop.service.paymentService.impl;

import com.etoiledespoir.onlinekvshop.domain.payment.Payment;

import com.etoiledespoir.onlinekvshop.repository.PaymentRepo.IpaymentInt;
import com.etoiledespoir.onlinekvshop.service.paymentService.IpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PayService implements IpayService {
    private static PayService payService=null;
   @Autowired
   private IpaymentInt ipayment;

    private PayService() {
    }

    public static PayService getPayService(){
        if(payService==null) {
            return payService = new PayService();
        }return payService;
    }
    @Override
    public Payment creat(Payment payment) {
        return ipayment.save(payment);
    }

    @Override
    public Payment delete(String id) {
        Optional<Payment> mypayment=ipayment.findById(id);
        if(mypayment==null){
            ipayment.deleteById(id);
        }
        return mypayment.orElse(null);
    }

    @Override
    public Payment Update(Payment payment) {
        return ipayment.save(payment);
    }

    @Override
    public Payment read(String id) {
        Optional<Payment> mypayment=ipayment.findById(id);
        return mypayment.orElse(null);
    }

    @Override
    public List<Payment> readAll() {
        return ipayment.findAll();
    }
}
