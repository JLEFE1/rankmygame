package org.homegrown.domain.xml;

import com.sun.xml.internal.txw2.annotation.*;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by JoLe on 28/04/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Boardgame {

    @XmlAttribute(name = "objectid")
    Integer objectid;

    @XmlElement(name = "name")
    String name;

    @XmlElement(name = "yearpublished")
    Integer yearpublished;

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearpublished() {
        return yearpublished;
    }

    public void setYearpublished(int yearpublished) {
        this.yearpublished = yearpublished;
    }
}
