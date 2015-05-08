package org.homegrown.service;

import com.google.common.collect.Lists;
import org.homegrown.domain.Game;
import org.homegrown.domain.PlayedGame;
import org.homegrown.repository.PlayedGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("playedGameService")
@Repository
@Transactional
public class PlayedGameServiceImpl implements PlayedGameService {

    @Autowired
    private PlayedGameRepository playedGameRepository;

    @Override
    @Transactional(readOnly = true)
    public PlayedGame findById(final Long id) {
        return playedGameRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PlayedGame> findAll(){
        return Lists.newArrayList(playedGameRepository.findAll());
    }


}
