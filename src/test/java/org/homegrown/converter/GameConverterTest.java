package org.homegrown.converter;

import org.homegrown.domain.Game;
import org.homegrown.domain.xml.Boardgame;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by JoLe on 04/05/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GameConverterTest extends AbstractConverterTest {

    private final static String NAME = "Eclipse";
    private final static Long ID = 1L;

    Boardgame bggGame;
    Game game;

    @Before
    public void setUp() throws Exception {
        bggGame = new Boardgame();
        bggGame.setObjectid(ID);
        bggGame.setName(NAME);

    }

    @Test
    public void testConvert() throws Exception {

        game = new Game();
        game = GameConverter.convert(bggGame);

        assertEquals(game.getBggId(),ID);
        assertEquals(game.getGameTitle(),NAME);

    }
}