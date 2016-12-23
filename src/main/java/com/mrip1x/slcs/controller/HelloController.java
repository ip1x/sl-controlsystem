package com.mrip1x.slcs.controller;

import com.mrip1x.slcs.model.User;
import com.mrip1x.slcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue = "World") String name) {
        testJpa();
        model.addAttribute("name", name);
        return "hello";
    }

    private void testJpa(){
        User user = new User();
        user.setEmail("mrip1x@gmail.com");
        user.setLogin("mrip1x");
        user.setPassword("DWBH");
        userService.save(user);
        userService.save(user);
        System.out.println(user.getId());
        userService.findAllUsers().forEach(u -> System.out.println(u));
    }
}
