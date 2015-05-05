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
@XmlRootElement(name = "people")
@XmlAccessorType(XmlAccessType.FIELD)
public class People implements Serializable {

    @XmlElement(name = "person")
    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
