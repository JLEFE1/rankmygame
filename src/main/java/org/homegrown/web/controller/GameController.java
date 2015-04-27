package org.homegrown.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/games")
public class GameController {

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String newGame(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "games";
    }

}

