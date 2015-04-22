package org.homegrown.service;

import com.google.common.collect.Lists;
import org.homegrown.domain.Player;
import org.homegrown.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by JoLe on 16/04/15.
 */
@Service("playerService")
@Repository
@Transactional
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Player> findAll(){
        return Lists.newArrayList(playerRepo.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Player findById(final Long id) {
        return playerRepo.findOne(id);
    }

    @Override
    public Player save(final Player player) {
        return playerRepo.save(player);
    }

}
