package org.homegrown.web.form.games;

import org.homegrown.domain.PlayerResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JoLe on 08/05/15.
 */
public class LastGameForm {

    private String gameTitle;

    private List<PlayerResult> results;

    public LastGameForm(){

    }

    public LastGameForm(final String gameTitle, final List<PlayerResult> results) {
        this.gameTitle = gameTitle;
        this.results = new ArrayList<>();
        this.results.addAll(results);
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public List<PlayerResult> getResults() {
        return results;
    }

    public void setResults(List<PlayerResult> results) {
        this.results = results;
    }
}
