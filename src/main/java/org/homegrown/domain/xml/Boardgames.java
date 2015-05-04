package org.homegrown.domain.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by JoLe on 28/04/15.
 */
@XmlRootElement(name = "boardgames")
@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgames implements Serializable {

    @XmlElement(name = "boardgame")
    List<Boardgame> boardgames;

    public List<Boardgame> getBoardgames() {
        return boardgames;
    }

    public void setBoardgames(List<Boardgame> boardgames) {
        this.boardgames = boardgames;
    }

}
