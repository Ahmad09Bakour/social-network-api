package org.fasttrackit.socialnetworkapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String selfBackground;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelfBackground() {
        return selfBackground;
    }

    public void setSelfBackground(String selfBackground) {
        this.selfBackground = selfBackground;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", selfBackground='" + selfBackground + '\'' +
                '}';
    }
}
