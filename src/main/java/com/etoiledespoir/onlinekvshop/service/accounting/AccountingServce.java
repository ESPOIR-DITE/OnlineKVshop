package com.etoiledespoir.onlinekvshop.service.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.repository.accounting.AccountingRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountingServce implements Iservice<Accounting,String> {
    @Autowired
    AccountingRep accountingRep;
    private static AccountingServce accountingServce=null;

    private AccountingServce() {
    }
    public static AccountingServce getAccountingServce(){
        if(accountingServce==null){
            accountingServce=new AccountingServce();
        }return accountingServce;
    }

    @Override
    public Accounting creat(Accounting accounting) {
        return accountingRep.save(accounting);
    }

    @Override
    public Accounting delete(String id) {
        Optional<Accounting> result=accountingRep.findById(id);
        accountingRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Accounting Update(Accounting accounting) {
        return accountingRep.save(accounting);
    }

    @Override
    public Accounting read(String id) {
        Optional<Accounting> result=accountingRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Accounting> readAll() {
        return accountingRep.findAll();
    }
    public Accounting readwithItemId(String itemId){
        List<Accounting>result=accountingRep.findAll();
        for(Accounting accounting: result){
            if(accounting.getItemId().equals(itemId)){
                return accounting;
            }
        }
        return null;
    }
}
