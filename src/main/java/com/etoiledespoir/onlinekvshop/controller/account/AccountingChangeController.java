package com.etoiledespoir.onlinekvshop.controller.account;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/accountchange")
public class AccountingChangeController implements Icontroller<AccountChange,String> {
    @Autowired
    AccountChangeService accountChangeService;
    @PostMapping("/create")
    @Override
    public AccountChange create(@RequestBody AccountChange accountChange) {
        return accountChangeService.creat(accountChange);
    }

    @GetMapping("/read")
    @Override
    public AccountChange read(@RequestParam("id") String id) {
        return accountChangeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public AccountChange update(@RequestBody AccountChange accountChange) {
        return accountChangeService.Update(accountChange);
    }

    @GetMapping("/delete")
    @Override
    public AccountChange delete(@RequestParam("id") String id) {
        return accountChangeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<AccountChange> readAll() {
        return accountChangeService.readAll();
    }
}
