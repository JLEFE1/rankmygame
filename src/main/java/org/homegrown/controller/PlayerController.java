package org.homegrown.controller;

import org.homegrown.domain.Player;
import org.homegrown.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by JoLe on 22/04/15.
 */
@Controller
@RequestMapping("/players")
public class PlayerController {

    final Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    MessageSource messageSource;

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") Long id, Model uiModel){
        uiModel.addAttribute("player", playerService.findById(id));
        return "players/show";
    }

    @RequestMapping(value = "/{id}", params="form", method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") Long id, Model uiModel){
        uiModel.addAttribute("player", playerService.findById(id));
        return "players/updateForm";
    }

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String getPlayerList(ModelMap uiModel) {

        logger.info("Listing players");

        List<Player> players = playerService.findAll();
        uiModel.addAttribute("players", players);

        logger.info("No. of players: " + players.size());

        return "players/playerlist";
    }

}

