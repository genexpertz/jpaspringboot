package org.cdit.cmo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by admin on 07/04/18.
 */

@Entity()
public class UserDemog {

    public UserDemog(String name, Date dob, int age){
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public UserDemog(){

    }

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date dob;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
