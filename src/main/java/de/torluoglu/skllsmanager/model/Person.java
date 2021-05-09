package de.torluoglu.skllsmanager.model;

import javax.persistence.*;
import java.io.Serializable;
/*
 * Serializable cause transform this Java-Class in different types of streams, for example for save in the DB and
 * sent to the Front-End as JSON.
 * 210509/TYN1 add new Class Person
 */

@Entity
public class Person implements Serializable
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( nullable = false, updatable = false )
    private Long id;
    private String firstname;
    private String lastname;
    private String location;
    private String email;
    private String imgURL;

    public Person()
    {
    }

    public Person(Long id, String firstname, String lastname, String location, String email, String imgURL)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.email = email;
        this.imgURL = imgURL;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation( String location )
    {
        this.location = location;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getImgURL()
    {
        return imgURL;
    }

    public void setImgURL( String imgURL )
    {
        this.imgURL = imgURL;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", imgURL='" + imgURL + '\'' +
                '}';
    }
}
