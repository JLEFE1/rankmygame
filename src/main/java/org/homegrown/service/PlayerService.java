package org.homegrown.service;

import org.homegrown.domain.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    Player findById(final Long id);

    Player save(final Player player);

}
