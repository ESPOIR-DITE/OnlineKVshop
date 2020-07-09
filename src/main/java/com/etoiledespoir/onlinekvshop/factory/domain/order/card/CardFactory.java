package com.etoiledespoir.onlinekvshop.factory.domain.order.card;

import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class CardFactory {
    public static Card getCard(String itemId, String customerId,int quantity){
        return new Card.Builder(Igenerator.getSuffixFromClassName(CardFactory.class)).buildQuantity(quantity).buildCustomer(customerId).buildItemId(itemId).build();
    }
}
