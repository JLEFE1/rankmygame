package org.homegrown.web.controller;

import org.homegrown.domain.PlayedGame;
import org.homegrown.domain.Player;
import org.homegrown.domain.xml.Boardgame;
import org.homegrown.domain.xml.Boardgames;
import org.homegrown.service.GameService;
import org.homegrown.service.PlayedGameService;
import org.homegrown.web.form.games.FindGameForm;
import org.homegrown.web.form.games.LastGameForm;
import org.homegrown.web.form.games.RankedGameForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    private PlayedGameService playedGameService;

    @RequestMapping(value = "/lastgames", method = RequestMethod.GET)
    public String lastGames(Model uimodel){

        PlayedGame game = playedGameService.findById(3L);

        LastGameForm form = new LastGameForm(game.getRankableGame().getGameTitle(), game.getPlayerResults());
        uimodel.addAttribute("form", form);

        return "ranking/lastgames";
    }

    @RequestMapping(value = "addGameResult", method = RequestMethod.GET)
    public String addGameResult(ModelMap uiModel) {

        Player pl1 = new Player();
        pl1.setFirstName("Fn1");
        pl1.setLastName("Ln1");
        Player pl2 = new Player();
        pl2.setFirstName("Fn2");
        pl2.setLastName("Ln2");

        RankedGameForm rankedGameForm = new RankedGameForm();
        rankedGameForm.addPlayer(pl1);
        rankedGameForm.addPlayer(pl2);

        uiModel.addAttribute("rankedGameForm", rankedGameForm);


        return "ranking/addGameResult";
    }

}

