package com.mrip1x.slcs.service;

import com.mrip1x.slcs.model.Board;

import java.util.List;

public interface BoardService {
    Board findBoardById(Long id);

    List<Board> findAllBoards();

    Board save(Board Board);
    List<Board> saveAll(List<Board> Boards);

    void delete(Board Board);
    void deleteById(Long id);
    void deleteAll();
}
