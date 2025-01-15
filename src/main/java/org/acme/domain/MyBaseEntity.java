package org.acme.domain;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MyBaseEntity extends MySuperBaseEntity{
    
    String description;

    public String getDesc() {
        return description;
    }

    @Override
    public String toString() {
        return "MyBaseEntity{" 
                + "description=" + description +","
                + super.toString()
                + '}';
    }
}
