package com.mrip1x.slcs.controller;

import com.mrip1x.slcs.model.Board;
import com.mrip1x.slcs.model.Card;
import com.mrip1x.slcs.model.User;
import com.mrip1x.slcs.service.BoardService;
import com.mrip1x.slcs.service.CardService;
import com.mrip1x.slcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;
    @Autowired
    private BoardService boardService;
    @Autowired
    private CardService cardService;

    @RequestMapping(value = {"/hello","/",""})
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        userService.deleteAll();
        cardService.deleteAll();
        boardService.deleteAll();
        testUserBL();
        testBoardAndCardBL();
        model.addAttribute("name", name);
        return "hello";
    }

    private void testUserBL() {
        User user = new User();
        user.setEmail("mrip1x@gmail.com");
        user.setLogin("mrip1x");
        user.setPassword("DWBH");
        userService.save(user);
        userService.save(user);
        System.out.println(user.getId());
        userService.findAllUsers().forEach(u -> System.out.println(u));
    }

    private void testBoardAndCardBL() {
        System.out.println("Board And Card test");
        Board board = new Board();
        board.setName("bp");
        Card card = new Card();
        card.setName("card 1");
        card.setBoard(board);
        board.addCard(card);
        card = new Card();
        card.setName("card 2");
        card.setBoard(board);
        board.addCard(card);
        card = new Card();
        card.setName("card 3");
        card.setBoard(board);
        board.addCard(card);
        card = new Card();
        card.setName("card 4");
        card.setBoard(board);
        board.addCard(card);
        board = boardService.save(board);
        List<Board> boards = boardService.findAllBoards();
        boards.forEach(b -> System.out.println(b));
        System.out.println(board);
        boardService.findBoardById(board.getId()).getCards().forEach(p -> System.out.println(p));
    }
}
