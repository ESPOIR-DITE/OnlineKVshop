package com.etoiledespoir.onlinekvshop.service.item.card;

import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import com.etoiledespoir.onlinekvshop.repository.order.card.CardRepository;
import com.etoiledespoir.onlinekvshop.service.item.card.impl.CardServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CardService implements CardServiceInt {
    @Autowired
    CardRepository cardRepository;

    private static CardService cardService=null;

    public CardService() {
    }
    public static CardService getCardService(){
        if(cardService==null){
            cardService=new CardService();
        }return cardService;
    }

    @Override
    public Card creat(Card card) {
        return cardRepository.save(card);
    }
    public Boolean remove(Card card){
        for(Card card1: readAll()){
            if(card1.getItemId().equals(card.getItemId())&&card1.getCustomerId().equals(card.getCustomerId())){
                cardRepository.delete(card1);
                return true;
            }
        }
        return false;
    }

    @Override
    public Card delete(String id) {
        Optional<Card> result=cardRepository.findById(id);
        cardRepository.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Card Update(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card read(String id) {
        Optional<Card> result=cardRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Card> readAll() {
        return cardRepository.findAll();
    }

    public List<Card> readWithItemId(String itemId){
        List<Card> cardList=new ArrayList<>();
        for(Card card: readAll()){
            if(card.getItemId().equals(itemId)){
                cardList.add(card);
            }
        }
        return cardList;
    }
    public List<Card> readWithCustId(String custId){
        List<Card> cardList=new ArrayList<>();
        for(Card card: readAll()){
            if(card.getCustomerId().equals(custId)){
                cardList.add(card);
            }
        }
        return cardList;
    }
    //if the card exist with the same item and same customer
    public Card verify(Card card){
        for(Card card1: readAll()){
            if( card1.getCustomerId().equals(card.getCustomerId())&& card1.getItemId().equals(card.getItemId())){
                return card1;
            }
        }return  null;
    }
}
