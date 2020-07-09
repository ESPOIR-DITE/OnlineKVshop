package com.etoiledespoir.onlinekvshop.controller.account.payment;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.accounting.payment.Payment;
import com.etoiledespoir.onlinekvshop.service.accounting.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping(value = "/OKVS/payment")
public class PaymentController implements Icontroller<Payment,String> {

    @Autowired
    private PaymentService payment;

    @PostMapping("/creat")
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
    public List<Payment> readAll() {
        return payment.readAll();
    }
}
