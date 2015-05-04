package org.homegrown.service;

import org.homegrown.domain.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    Player findById(final Long id);

    List<Player> findByCriteria(final String firstName, final String lastName);

    Player save(final Player player);

}
