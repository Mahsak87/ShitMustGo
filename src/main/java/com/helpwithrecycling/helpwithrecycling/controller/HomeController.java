package com.helpwithrecycling.helpwithrecycling.controller;

import com.helpwithrecycling.helpwithrecycling.service.GarbageService;
import com.helpwithrecycling.helpwithrecycling.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public record HomeController(UsersService usersService , GarbageService garbageService) {

    @Autowired
    public HomeController {
    }
}
