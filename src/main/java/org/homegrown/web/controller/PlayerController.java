package org.homegrown.web.controller;

import org.homegrown.domain.Player;
import org.homegrown.domain.search.PlayerSearchFields;
import org.homegrown.service.PlayerService;
import org.homegrown.web.form.Message;
import org.homegrown.web.form.games.RankedGameForm;
import org.homegrown.web.util.UrlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

    @RequestMapping(value = "addPlayer", method = RequestMethod.GET)
    public String addPlayer(final Model uiModel){
        uiModel.addAttribute("player", new Player());
        return "players/updateForm";
    }

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

    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.POST)
    public String update(@Valid Player player, BindingResult bindingResult, Model uiModel,
                         HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {
        logger.info("Updating player");
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("message", new Message("error", messageSource.getMessage("player_save_fail", new Object[]{}, locale)));
            uiModel.addAttribute("player", player);
            return "players/updateForm";
        }
        uiModel.asMap().clear();
        redirectAttributes.addFlashAttribute("message", new Message("success", messageSource.getMessage("player_save_success", new Object[]{}, locale)));

        playerService.save(player);
        return "redirect:/players/" + UrlUtil.encodeUrlPathSegment(player.getId().toString(), httpServletRequest);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getPlayerList(ModelMap uiModel) {
        return "players";
    }

    @RequestMapping(value = "findPlayer", method = RequestMethod.GET)
    public String searchPlayerResult(ModelMap uiModel) {

        PlayerSearchFields playerSearchFields = new PlayerSearchFields();
        List<Player> players = new ArrayList<>();

        uiModel.addAttribute("players", players);
        uiModel.addAttribute("playerSearchFields", playerSearchFields);

        return "players/findPlayer";
    }

    @RequestMapping(value = "findPlayer", method = RequestMethod.POST)
    public String searchPlayer(final PlayerSearchFields playerSearchFields, BindingResult bindingResult, final ModelMap uiModel,
                               HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale) {

        logger.info("Searching for players");

        List<Player> players;
//        if ("".equals(playerSearchFields.getFirstName()) && "".equals(playerSearchFields.getLastName())){
        if (playerSearchFields.getFirstName() == null && playerSearchFields.getLastName() == null){
            players = playerService.findAll();
        } else {
            players = playerService.findByCriteria(playerSearchFields.getFirstName(), playerSearchFields.getLastName());
        }

        uiModel.addAttribute("players", players);
        uiModel.addAttribute("playerSearchFields", playerSearchFields);

        return "players/findPlayer";
    }

}

