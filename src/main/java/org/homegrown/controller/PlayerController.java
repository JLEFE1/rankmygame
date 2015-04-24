package org.homegrown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/players")
public class PlayerController {

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String newPlayer(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "players";
    }

}

