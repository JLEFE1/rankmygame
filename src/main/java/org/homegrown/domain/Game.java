package org.homegrown.domain;

import java.io.Serializable;

public class Game implements Serializable {

    private String gameTitle;

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String firstName) {
        this.gameTitle = gameTitle;
    }

    public String toString() {
        return "Game title: " + gameTitle;
    }
}
