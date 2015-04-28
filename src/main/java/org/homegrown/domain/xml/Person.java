package org.homegrown.domain.xml;

import javax.persistence.PersistenceContext;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by JoLe on 28/04/15.
 */
public class Person {

    @XmlElement(name = "name")
    private  String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "description")
    private String description;
}
