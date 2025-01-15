package org.acme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Entity
@IdClass(MyEntityPK.class)
public class MyEntity extends MyBaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEntity{"
                + "name=" + name + ","
                + super.toString()
                + '}';
    }
}
