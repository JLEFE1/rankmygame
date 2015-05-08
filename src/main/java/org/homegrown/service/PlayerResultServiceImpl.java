package org.homegrown.service;

import org.homegrown.repository.PlayerResultRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayerResultServiceImpl implements PlayerResultService {

    @Autowired
    private PlayerResultRepository playerResultRepository;

}
