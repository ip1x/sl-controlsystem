package com.mrip1x.slcs.service;

import com.mrip1x.slcs.model.Card;

import java.util.List;

public interface CardService {
    Card findCardById(Long id);

    List<Card> findAllCards();

    Card save(Card Card);
    List<Card> saveAll(List<Card> cards);

    void delete(Card Card);
    void deleteById(Long id);
    void deleteAll();
}
