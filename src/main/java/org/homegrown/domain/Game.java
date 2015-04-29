package org.homegrown.domain;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="GAMES")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "GAME_TITLE")
    private String gameTitle;

    @Column(name = "DESIGNER")
    private String designer;

    @Column(name = "PUBLISHER")
    private String publisher;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Column(name = "ARTIST")
    private String artist;

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
