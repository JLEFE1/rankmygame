package org.homegrown.jms.listener;

import org.homegrown.converter.GameConverter;
import org.homegrown.domain.Game;
import org.homegrown.domain.xml.Boardgame;
import org.homegrown.service.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.*;

/**
 * Created by JoLe on 04/05/15.
 */
public class ImportBGGGamesListener implements MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(ImportBGGGamesListener.class);

    @Autowired
    GameService gameService;

    @Override
    public void onMessage(Message message) {

        ObjectMessage objectMessage = (ObjectMessage) message;

        try {
            Game game = GameConverter.convert((Boardgame)objectMessage.getObject());
            gameService.save(game);

            logger.info("Message received: " + game.getGameTitle());
        } catch (JMSException e){
            logger.error("JMS error", e);
        }

    }
}
