package com.etoiledespoir.onlinekvshop.controller.account;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountingServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("OKVS/acounting")
public class AccountingController implements Icontroller<Accounting,String> {
    @Autowired
    private AccountingServce accountingServce;
    @PostMapping("/create")
    @Override
    public Accounting create(@RequestBody Accounting accounting) {
        return accountingServce.creat(accounting);
    }

    @GetMapping("/read")
    @Override
    public Accounting read(@RequestParam("id") String id) {
        return accountingServce.read(id);
    }

    @PostMapping("/update")
    @Override
    public Accounting update(@RequestBody Accounting accounting) {
        return accountingServce.Update(accounting);
    }

    @GetMapping("/delete")
    @Override
    public Accounting delete(@RequestParam("id") String id) {
        return accountingServce.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Accounting> readAll() {
        return accountingServce.readAll();
    }
}
