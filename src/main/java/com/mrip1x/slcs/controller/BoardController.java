package com.mrip1x.slcs.controller;

import com.mrip1x.slcs.model.Board;
import com.mrip1x.slcs.service.BoardService;
import com.mrip1x.slcs.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;
    @Autowired
    CardService cardService;

    @RequestMapping(value = "/{id:[\\d]+}", method = RequestMethod.GET)
    public ModelAndView getBoards(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("board");
        Board board = boardService.findBoardById(id);
        if(board == null){
            //TODO
        }
        modelAndView.addObject("board", board);
        return modelAndView;
    }

}
