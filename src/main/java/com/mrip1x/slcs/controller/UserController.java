package com.mrip1x.slcs.controller;

import com.mrip1x.slcs.model.User;
import com.mrip1x.slcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/signin"}, method = RequestMethod.GET)
    public String getSignInPage() {
        return "signin";
    }

}
