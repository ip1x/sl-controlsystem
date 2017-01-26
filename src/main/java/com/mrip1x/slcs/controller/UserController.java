package com.mrip1x.slcs.controller;

import com.mrip1x.slcs.model.User;
import com.mrip1x.slcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/signin"}, method = RequestMethod.GET)
    public String getSignInPage(User user) {
        return "signin";
    }

    @RequestMapping(value = {"/signin"}, method = RequestMethod.POST)
    public ModelAndView signIn(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("channel");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
