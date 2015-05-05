package org.homegrown.domain.xml;

import com.sun.xml.internal.txw2.annotation.*;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by JoLe on 28/04/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgame implements Serializable {

    @XmlAttribute(name = "objectid")
    private Long objectid;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "yearpublished")
    private Integer yearpublished;

    @XmlElement(name = "minplayers")
    private Integer minPlayers;

    @XmlElement(name = "maxplayers")
    private Integer maxPlayers;

    @XmlElement(name = "playingtime")
    private Integer playingtime;

    @XmlElement(name = "minplaytime")
    private Integer minplayingtime;

    @XmlElement(name = "maxplaytime")
    private Integer maxplayingtime;

    @XmlElement(name = "age")
    private Integer age;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "boardgamepublisher")
    private List<BoardgamePublisher> boardgamepublisher;

    @XmlElement(name = "boardgamedesigner")
    private List<BoardgameDesigner> boardgamedesigner;

    @XmlElement(name = "boardgameversion")
    private List<BoardgameVersion> boardgameversion;

    @XmlElement(name = "boardgamefamily")
    private List<BoardgameFamily> boardgamefamily;

    @XmlElement(name = "boardgamesubdomain")
    private List<BoardgameSubdomain> boardgamesubdomain;

    @XmlElement(name = "boardgamecategory")
    private List<BoardgameCategory> boardgamecategory;

    @XmlElement(name = "thumbnail")
    private String thumbnail;

    @XmlElement(name = "image")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<BoardgameDesigner> getBoardgamedesigner() {
        return boardgamedesigner;
    }

    public void setBoardgamedesigner(List<BoardgameDesigner> boardgamedesigner) {
        this.boardgamedesigner = boardgamedesigner;
    }

    public List<BoardgameVersion> getBoardgameversion() {
        return boardgameversion;
    }

    public void setBoardgameversion(List<BoardgameVersion> boardgameversion) {
        this.boardgameversion = boardgameversion;
    }

    public List<BoardgameFamily> getBoardgamefamily() {
        return boardgamefamily;
    }

    public void setBoardgamefamily(List<BoardgameFamily> boardgamefamily) {
        this.boardgamefamily = boardgamefamily;
    }

    public List<BoardgameSubdomain> getBoardgamesubdomain() {
        return boardgamesubdomain;
    }

    public void setBoardgamesubdomain(List<BoardgameSubdomain> boardgamesubdomain) {
        this.boardgamesubdomain = boardgamesubdomain;
    }

    public List<BoardgameCategory> getBoardgamecategory() {
        return boardgamecategory;
    }

    public void setBoardgamecategory(List<BoardgameCategory> boardgamecategory) {
        this.boardgamecategory = boardgamecategory;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public Integer getPlayingtime() {
        return playingtime;
    }

    public void setPlayingtime(Integer playingtime) {
        this.playingtime = playingtime;
    }

    public Integer getMinplayingtime() {
        return minplayingtime;
    }

    public void setMinplayingtime(Integer minplayingtime) {
        this.minplayingtime = minplayingtime;
    }

    public Integer getMaxplayingtime() {
        return maxplayingtime;
    }

    public void setMaxplayingtime(Integer maxplayingtime) {
        this.maxplayingtime = maxplayingtime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BoardgamePublisher> getBoardgamepublisher() {
        return boardgamepublisher;
    }

    public void setBoardgamepublisher(List<BoardgamePublisher> boardgamepublisher) {
        this.boardgamepublisher = boardgamepublisher;
    }

    public Integer getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(Integer minPlayers) {
        this.minPlayers = minPlayers;
    }

    public void setYearpublished(Integer yearpublished) {
        this.yearpublished = yearpublished;
    }

    public int getYearpublished() {
        return yearpublished;
    }

    public Long getObjectid() {
        return objectid;
    }

    public void setObjectid(Long objectid) {
        this.objectid = objectid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
