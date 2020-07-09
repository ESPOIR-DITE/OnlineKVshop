package com.etoiledespoir.onlinekvshop.service.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.repository.accounting.AccountingChangeRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountChangeService implements Iservice<AccountChange,String> {
    @Autowired
    AccountingChangeRep accountingChangeRep;
    private static AccountChangeService accountChangeService=null;

    private AccountChangeService() {
    }
    public static AccountChangeService getAccountChangeService(){
        if(accountChangeService==null){
            accountChangeService=new AccountChangeService();
        }return accountChangeService;
    }

    @Override
    public AccountChange creat(AccountChange accountChange) {
        return accountingChangeRep.save(accountChange);
    }

    @Override
    public AccountChange delete(String id) {
        Optional<AccountChange> result=accountingChangeRep.findById(id);
        accountingChangeRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public AccountChange Update(AccountChange accountChange) {
        return accountingChangeRep.save(accountChange);
    }

    @Override
    public AccountChange read(String id) {
        Optional<AccountChange> result=accountingChangeRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<AccountChange> readAll() {
        return accountingChangeRep.findAll();
    }
    public List<AccountChange> changeOf(String itemId){
        List<AccountChange>toReturn=new ArrayList<>();
        List<AccountChange>result=accountingChangeRep.findAll();
        for(AccountChange accountChange: result){
            if(accountChange.getItemId().equals(itemId)){
                toReturn.add(accountChange);
            }
        }
        return toReturn;
    }
}
