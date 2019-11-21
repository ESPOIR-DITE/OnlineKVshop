package com.etoiledespoir.onlinekvshop.factory.domain.card;

import com.etoiledespoir.onlinekvshop.domain.card.Card;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class CardFactory {
    public static Card getCard(String itemId, String customerId){
        return new Card.Builder(Igenerator.getSuffixFromClassName(CardFactory.class)).buildCustomer(customerId).buildItemId(itemId).build();
    }
}
