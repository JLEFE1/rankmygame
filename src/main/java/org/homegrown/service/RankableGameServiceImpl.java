package org.homegrown.service;

import org.homegrown.repository.RankableGameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RankableGameServiceImpl implements  RankableGameService {

    @Autowired
    private RankableGameRepository rankableGameRepository;

}
