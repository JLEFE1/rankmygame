package org.homegrown.domain.search;

/**
 * Created by JoLe on 05/05/15.
 */
public class PlayerSearchFields {

    private String firstName;

    private String lastName;

    public PlayerSearchFields(){
        this.firstName = null;
        this.lastName = null;
    }

    public String getFirstName() {
        if("".equals(this.firstName)){
            this.firstName = null;
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if("".equals(this.lastName)){
            this.lastName = null;
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
