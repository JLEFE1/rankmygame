package org.homegrown.service;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.homegrown.converter.GameConverter;
import org.homegrown.domain.Game;
import org.homegrown.domain.xml.Boardgame;
import org.homegrown.domain.xml.Boardgames;
import org.homegrown.jms.sender.ImportBGGGamesSender;
import org.homegrown.repository.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by JoLe on 16/04/15.
 */
@Service("gameService")
@Repository
@Transactional
public class GameServiceImpl implements GameService {

    private final static String URL = "http://boardgamegeek.com/xmlapi/search?search=";
    private final static String URL_FIND_GAME_BY_ID = "http://www.boardgamegeek.com/xmlapi/boardgame/";

    Logger logger = LoggerFactory.getLogger(GameServiceImpl.class);

    @Autowired
    ImportBGGGamesSender sender;

    @Autowired
    private GameRepository gameRepo;

    private RestTemplate restTemplate;

    @Override
    @Transactional(readOnly = true)
    public List<Game> findAll(){
        return Lists.newArrayList(gameRepo.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Game findByBggId(final Long bggId) {
        return gameRepo.findByBggId(bggId);
    }

    @Override
    @Transactional(readOnly = true)
    public Game findById(final Long id) {
        return gameRepo.findOne(id);
    }

    @Override
    public Game save(final Game game) {
        return gameRepo.save(game);
    }

    @Override
    @Transactional(readOnly = true)
    public Boardgames findGameOnBggByName(String name) {
        restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL + name, Boardgames.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Boardgame findGameOnBggById(Long id) {
        restTemplate = new RestTemplate();

        String test = restTemplate.getForObject(URL_FIND_GAME_BY_ID + id, String.class);
        Boardgames games = restTemplate.getForObject(URL_FIND_GAME_BY_ID + id, Boardgames.class);

        return games.getBoardgames().get(0);
    }

    @Override
    public void saveBGGsInDb(final List<Boardgame> bggGames) {

        if (CollectionUtils.isNotEmpty(bggGames)){
            for (Boardgame bggGame:bggGames){
                saveBGGInDb(bggGame);
            }
        }
    }

    @Override
    public void saveBGGInDb(final Boardgame bggGame) {

        Game game = gameRepo.findByBggId(bggGame.getObjectid());

        if (game == null){
            sender.sendMessage(bggGame);
        } else {
            logger.info( game.getGameTitle() + " already exists in DB");
        }
    }

}
