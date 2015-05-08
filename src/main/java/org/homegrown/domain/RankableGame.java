package org.homegrown.domain;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by JoLe on 08/05/15.
 */
@Entity
@Table(name = "RANKABLEGAMES")
public class RankableGame {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "BGG_OBJECT_ID")
    private Game bggGame;

    @OneToMany(mappedBy = "rankableGame", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlayedGame> playedGames;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getBggGame() {
        return bggGame;
    }

    public void setBggGame(Game bggGame) {
        this.bggGame = bggGame;
    }

    public List<PlayedGame> getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(List<PlayedGame> playedGames) {
        this.playedGames = playedGames;
    }
}
