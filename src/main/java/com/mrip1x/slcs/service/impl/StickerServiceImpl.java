package com.mrip1x.slcs.service.impl;

import com.mrip1x.slcs.model.Sticker;
import com.mrip1x.slcs.repository.StickerRepository;
import com.mrip1x.slcs.service.StickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StickerServiceImpl implements StickerService {

    @Autowired
    private StickerRepository repository;

    @Override
    public Sticker findStickerById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Sticker> findAllStickers() {
        return repository.findAll();
    }

    @Override
    public Sticker save(Sticker Sticker) {
        return repository.save(Sticker);
    }

    @Override
    public List<Sticker> saveAll(List<Sticker> Stickers) {
        return repository.save(Stickers);
    }

    @Override
    public void delete(Sticker Sticker) {
        repository.delete(Sticker);
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
