package com.etoiledespoir.onlinekvshop.service.paymentService.impl;

import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.factory.repository.PaymentRepFactory;
import com.etoiledespoir.onlinekvshop.repository.PaymentRepo.PaymentRepository;
import com.etoiledespoir.onlinekvshop.service.paymentService.IpayService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PayService implements IpayService {
    private static PayService payService=null;
    private PaymentRepository pay=PaymentRepFactory.getPayRep();

    private PayService() {
    }

    public static PayService getPayService(){
        if(payService==null) {
            return payService = new PayService();
        }return payService;
    }
    @Override
    public Payment creat(Payment payment) {
        return pay.creat(payment);
    }

    @Override
    public Payment delete(String id) {
        return pay.delete(id);
    }

    @Override
    public Payment Update(Payment payment) {
        return pay.Update(payment);
    }

    @Override
    public Payment read(String id) {
        return pay.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return pay.readAll();
    }

    @Override
    public String getPremier() {
        return null;
    }
}
