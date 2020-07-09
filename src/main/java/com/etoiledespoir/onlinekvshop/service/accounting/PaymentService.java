package com.etoiledespoir.onlinekvshop.service.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.payment.Payment;

import com.etoiledespoir.onlinekvshop.repository.accounting.PaymentRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService implements Iservice<Payment,String> {
    private static PaymentService paymentService =null;
   @Autowired
   private PaymentRepository ipayment;

    private PaymentService() {
    }

    public static PaymentService getPaymentService(){
        if(paymentService ==null) {
            return paymentService = new PaymentService();
        }return paymentService;
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
