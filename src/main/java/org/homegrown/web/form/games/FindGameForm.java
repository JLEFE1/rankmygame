package org.homegrown.web.form.games;

import org.homegrown.domain.xml.Boardgame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JoLe on 28/04/15.
 */
public class FindGameForm {

    private String lookUpTag;

    public List<Boardgame> getGames() {
        if (games == null){
            games = new ArrayList<>();
        }
        return games;
    }

    public void setGames(List<Boardgame> games) {
        this.games = games;
    }

    public String getLookUpTag() {
        return lookUpTag;
    }

    public void setLookUpTag(String lookUpTag) {
        this.lookUpTag = lookUpTag;
    }

    private List<Boardgame> games;
}
