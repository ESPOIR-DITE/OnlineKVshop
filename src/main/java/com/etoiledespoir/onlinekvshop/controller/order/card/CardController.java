package com.etoiledespoir.onlinekvshop.controller.order.card;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import com.etoiledespoir.onlinekvshop.factory.domain.order.card.CardFactory;
import com.etoiledespoir.onlinekvshop.service.order.card.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OKVS/card")
public class CardController implements Icontroller<Card,String> {
    @Autowired
    CardService cardService;

    @GetMapping("/readWithCustId")
    public List<Card> readsWithCustId(@RequestParam("id") String custId) {
        return cardService.readWithCustId(custId);
    }

    @GetMapping("/readWithItemId")
    public List<Card> readsWithItemId(@RequestParam("id") String itemId) {
        return cardService.readWithItemId(itemId);
    }


    public int calculationOfQuantity(int intial, int current){
        int result=0;
        if(intial>current){
            result=current;
        }else if(current<intial){

        }
        return result;
    }
    @PostMapping("/create")
    @Override
    public Card create(@RequestBody Card card) {
        Card key=cardService.verify(card);
        if(key!=null){
            //cardService.delete(key.getId());
            //so here we will combine the quantity of the prvios card to the actual
            //so we need to delete the previous card first
            cardService.delete(key.getId());
            Card card1= CardFactory.getCard(card.getItemId(),card.getCustomerId(),card.getQuantity());
            return cardService.creat(card1);
        }
        if(card.getQuantity()<1){
            Card card1= CardFactory.getCard(card.getItemId(),card.getCustomerId(),1);
            return cardService.creat(card1);
        }
        Card card1= CardFactory.getCard(card.getItemId(),card.getCustomerId(),card.getQuantity());
        return cardService.creat(card1);
    }
    @PostMapping("/remove")
    public boolean remove(@RequestBody Card card) {
        Card card1= CardFactory.getCard(card.getItemId(),card.getCustomerId(),card.getQuantity());
        return cardService.remove(card1);
    }
    @GetMapping("/read")
    @Override
    public Card read(@RequestParam("id") String id) {
        return cardService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Card update(@RequestBody Card card) {
        return cardService.Update(card);
    }

    @GetMapping("/delete")
    @Override
    public Card delete(@RequestParam("id") String id) {
        return cardService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Card> readAll() {
        return cardService.readAll();
    }
}
