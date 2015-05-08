package org.homegrown.service;

import org.homegrown.domain.Game;
import org.homegrown.domain.PlayedGame;
import org.homegrown.domain.xml.Boardgame;
import org.homegrown.domain.xml.Boardgames;

import java.util.List;

public interface PlayedGameService {

    List<PlayedGame> findAll();

    PlayedGame findById(final Long id);

}
