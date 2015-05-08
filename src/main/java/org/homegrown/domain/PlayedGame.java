package org.homegrown.domain;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by JoLe on 08/05/15.
 */
@Entity
@Table(name = "PLAYEDGAMES")
public class PlayedGame {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "RANKABLEGAME_ID")
    private RankableGame rankableGame;

    @Column(name = "DATE")
    private Date date;

    @OneToMany(mappedBy = "playedGame", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlayerResult> playerResults;

    @PrePersist
    @PreUpdate
    public void setDateBeforePersisting(){
        date = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public RankableGame getRankableGame() {
        return rankableGame;
    }

    public List<PlayerResult> getPlayerResults() {
        return playerResults;
    }

    public void setPlayerResults(List<PlayerResult> playerResults) {
        this.playerResults = playerResults;
    }

    public void setRankableGame(RankableGame rankableGame) {
        this.rankableGame = rankableGame;
    }


}
