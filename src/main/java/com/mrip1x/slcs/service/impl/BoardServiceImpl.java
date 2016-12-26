package com.mrip1x.slcs.service.impl;

import com.mrip1x.slcs.model.Board;
import com.mrip1x.slcs.repository.BoardRepository;
import com.mrip1x.slcs.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository repository;

    @Override
    public Board findBoardById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Board> findAllBoards() {
        return repository.findAll();
    }

    @Override
    public Board save(Board Board) {
        return repository.save(Board);
    }

    @Override
    public List<Board> saveAll(List<Board> Boards) {
        return repository.save(Boards);
    }

    @Override
    public void delete(Board Board) {
        repository.delete(Board);
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
