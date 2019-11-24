package com.etoiledespoir.onlinekvshop.repository.card;

import com.etoiledespoir.onlinekvshop.domain.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,String> {
}
