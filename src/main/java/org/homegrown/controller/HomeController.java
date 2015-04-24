package org.homegrown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    Boolean bool = false;

    public Boolean getBool(){
        return this.bool;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");

        return "home";
    }

    @RequestMapping(value = "player", params = "form", method = RequestMethod.GET)
    public String newPlayer(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "players";
    }

    @RequestMapping(value = "game", params = "form", method = RequestMethod.GET)
    public String newGame(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "games";
    }

}

