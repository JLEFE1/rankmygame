package org.homegrown.converter;

import org.homegrown.domain.Game;
import org.homegrown.domain.xml.Boardgame;

/**
 * Created by JoLe on 04/05/15.
 */
public class GameConverter {

    public static Game convert(final Boardgame bggGame){

        Game game = new Game();

        game.setBggId(bggGame.getObjectid());
        game.setGameTitle(bggGame.getName());

        return game;
    }
}
