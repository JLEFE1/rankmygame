package org.homegrown.web.controller;

import org.homegrown.domain.Games;
import org.homegrown.domain.xml.Boardgames;
import org.homegrown.service.GameService;
import org.homegrown.service.GameServiceImpl;
import org.homegrown.web.form.games.FindGameForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/games")
public class GameController {

    private final static String URL = "http://boardgamegeek.com/xmlapi/search?search=galaxy";

    @Autowired
    private GameService gameService;

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String newGame(Model uiModel) {
        uiModel.addAttribute("message", "Hello world!");
        return "games";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String findGameInBGG(Model uimodel){

        FindGameForm form = new FindGameForm();
        Boardgames games = gameService.findGameOnBggByName("galaxy");

        form.getGames().addAll(games.getBoardgames());

        uimodel.addAttribute("form", form);
        return "games/find";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String foundGameInBGG(Model uimodel){

        FindGameForm form = new FindGameForm();
        Boardgames games = gameService.findGameOnBggByName("galaxy");

        form.getGames().addAll(games.getBoardgames());

        uimodel.addAttribute("form", form);
        return "games/find";
    }

}

