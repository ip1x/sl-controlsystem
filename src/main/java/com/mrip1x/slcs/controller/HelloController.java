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

import java.util.HashSet;
import java.util.Set;

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
        boardService.deleteAll();
        cardService.deleteAll();
        testUserBL();
        testBoardBL();
        testCardBL();
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

    private void testBoardBL() {
        System.out.println("Board test");
        Board board = new Board();
        board.setName("board 1");
        boardService.save(board);
        boardService.save(board);
        System.out.println(board.getId());
        boardService.findAllBoards().forEach(u -> System.out.println(u));
    }

    private void testCardBL() {
        System.out.println("Card test");
        Card card = new Card();
        card.setName("card 1");
        cardService.save(card);
        cardService.save(card);
        System.out.println(card.getId());
        cardService.findAllCards().forEach(u -> System.out.println(u));
    }

    private void testBoardAndCardBL() {
        System.out.println("Board And Card test");
        Board board = new Board();
        board.setName("bp");
        board = boardService.save(board);
        Card card = new Card();
        card.setName("pfb");
        card = cardService.save(card);
        Set<Card> cards = new HashSet<>();
        cards.add(card);
        board.setCards(cards);
        board = boardService.save(board);
        System.out.println(board);
        System.out.println(card);
        boardService.findBoardById(board.getId()).getCards().forEach(p -> System.out.println(p));
    }
}
