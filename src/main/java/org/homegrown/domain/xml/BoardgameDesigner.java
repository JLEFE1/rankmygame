package org.homegrown.domain.xml;

import javax.xml.bind.annotation.*;

/**
 * Created by JoLe on 28/04/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "boardgamedesigner")
public class BoardgameDesigner {

    @XmlAttribute(name = "objectid")
    private Integer objectid;

    @XmlElementRef(name = "boardgamedesigner")
    private String name;

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
}
