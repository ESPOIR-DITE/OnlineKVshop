package com.etoiledespoir.onlinekvshop.controller.payment;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.service.paymentService.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@Component
@RequestMapping(value = "/OKVS/payment")
public class PaymentController implements Icontroller<Payment,String> {

    @Autowired
    private PayService payment;

    @PostMapping("/newpayment")
    @Override
    public Payment create(@RequestBody Payment payment) {
        return this.payment.creat(payment);
    }
    @GetMapping("/read")
    @Override
    public Payment read(@RequestParam(value = "id") String id) {
        return payment.read(id);
    }
    @PostMapping("/update")
    @Override
    public Payment update(@RequestBody Payment payment) {
        return this.payment.Update(payment);
    }
    @GetMapping("/delete")
    @Override
    public Payment delete(@RequestParam(value = "id") String id) {
        return payment.delete(id);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<String> readAll() {
        return payment.readAll();
    }
}
