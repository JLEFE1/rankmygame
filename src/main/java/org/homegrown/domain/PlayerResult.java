package org.homegrown.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="PLAYERRESULTS")
public class PlayerResult implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PLAYEDGAME_ID")
    private PlayedGame playedGame;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID")
    private Player player;

    @Column(name = "RANK")
    private Integer rank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlayedGame getPlayedGame() {
        return playedGame;
    }

    public void setPlayedGame(PlayedGame playedGame) {
        this.playedGame = playedGame;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
