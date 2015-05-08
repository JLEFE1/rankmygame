package org.homegrown.service;

import org.homegrown.repository.PlayedGameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayedGameServiceImpl implements PlayedGameService {

    @Autowired
    private PlayedGameRepository playedGameRepository;

}
