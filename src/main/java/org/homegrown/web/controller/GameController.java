package org.homegrown.web.controller;

import org.homegrown.domain.PlayedGame;
import org.homegrown.domain.xml.Boardgame;
import org.homegrown.domain.xml.Boardgames;
import org.homegrown.service.GameService;
import org.homegrown.service.PlayedGameService;
import org.homegrown.web.form.games.FindGameForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/games")
public class GameController {

    private final static String URL = "http://boardgamegeek.com/xmlapi/search?search=galaxy";

    @Autowired
    private GameService gameService;

    @Autowired
    private PlayedGameService playedGameService;

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String newGame(Model uiModel) {
        uiModel.addAttribute("message", "Hello world!");
        return "games";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String findGameInBGG(Model uimodel){
        uimodel.addAttribute("form", new FindGameForm());
        return "games/find";
    }

    @RequestMapping(value = "/lastgames", method = RequestMethod.GET)
    public String lastGames(Model uimodel){

        PlayedGame game = playedGameService.findById(3L);

        return "games/lastgames";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String foundGameInBGG(FindGameForm form, Model uimodel){

        String lookUp = form.getLookUpTag();
        Boardgames games;

        if (lookUp != null && lookUp != ""){
            games = gameService.findGameOnBggByName(lookUp);
            if (games.getBoardgames().size() != 0) {
                form.getGames().addAll(games.getBoardgames());
                gameService.saveBGGsInDb(games.getBoardgames());
            }
        }



        uimodel.addAttribute("form", form);
        return "games/find";
    }

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public String findGameInBGG(@PathVariable("id") Long id, Model uimodel){

        Boardgame game = gameService.findGameOnBggById(id);

        uimodel.addAttribute("game", game);
        return "games/game/show";
    }

}

