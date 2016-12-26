package com.mrip1x.slcs.service.impl;

import com.mrip1x.slcs.model.Card;
import com.mrip1x.slcs.repository.CardRepository;
import com.mrip1x.slcs.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository repository;

    @Override
    public Card findCardById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Card> findAllCards() {
        return repository.findAll();
    }

    @Override
    public Card save(Card Card) {
        return repository.save(Card);
    }

    @Override
    public List<Card> saveAll(List<Card> cards) {
        return repository.save(cards);
    }

    @Override
    public void delete(Card Card) {
        repository.delete(Card);
    }

    @Override
    public void deleteById(Long id) {
        repository.delete(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
