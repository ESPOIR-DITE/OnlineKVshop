package com.etoiledespoir.onlinekvshop.controller.order.card.impl;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.card.Card;

import java.util.List;

public interface CardControllerInt extends Icontroller<Card,String> {
    List<Card> readsWithCustId(String custId);
    List<Card> readsWithItemId(String itemId);
}
