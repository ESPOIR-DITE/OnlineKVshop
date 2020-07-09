package com.etoiledespoir.onlinekvshop.repository.order.card;

import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,String> {
}
