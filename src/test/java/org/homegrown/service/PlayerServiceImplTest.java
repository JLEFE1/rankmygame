package org.homegrown.service;

import org.homegrown.domain.Player;
import org.homegrown.test.annotation.DataSets;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JoLe on 05/05/15.
 */
public class PlayerServiceImplTest extends AbstractServiceImplTest {

    @Autowired
    PlayerService playerService;

    @DataSets
    @Test
    public void testFindAll() throws Exception {

        List<Player> result = playerService.findAll();

        assertNotNull(result);
        assertEquals(12, result.size());

    }

    @Test
    public void testFindById() throws Exception {

    }

    @Test
    public void testFindByCriteria() throws Exception {

    }

    @Test
    public void testSave() throws Exception {

    }
}