package com.mrip1x.slcs.service;

import com.mrip1x.slcs.model.Sticker;

import java.util.List;

public interface StickerService {
    Sticker findStickerById(Long id);

    List<Sticker> findAllStickers();

    Sticker save(Sticker Sticker);
    List<Sticker> saveAll(List<Sticker> Stickers);

    void delete(Sticker Sticker);
    void deleteById(Long id);
    void deleteAll();
}
