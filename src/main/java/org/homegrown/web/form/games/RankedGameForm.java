package org.homegrown.web.form.games;

import org.homegrown.domain.Game;
import org.homegrown.domain.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JoLe on 05/05/15.
 */
public class RankedGameForm {

    private Game game;

    private List<Player> players;

    private String[] playerNames;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void addPlayer(final Player player){
        if (players == null){
            players = new ArrayList<>();
        }
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String[] getPlayerNames() {
        if (playerNames == null){
            playerNames = new String[10];
        }
        return playerNames;
    }

    public void setPlayerNames(String[] playerNames) {
        this.playerNames = playerNames;
    }
}
