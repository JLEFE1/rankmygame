package org.homegrown.service;

import org.homegrown.domain.Game;
import org.homegrown.domain.Player;
import org.homegrown.domain.xml.Boardgame;
import org.homegrown.domain.xml.Boardgames;

import java.util.List;

public interface GameService {

    List<Game> findAll();

    Game findById(final Long id);

    Game save(final Game game);

    Boardgames findGameOnBggByName(final String name);

    Boardgame findGameOnBggById(final Long id);

}
