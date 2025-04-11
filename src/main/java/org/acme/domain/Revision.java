package org.acme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Revision extends RevisionBase{
    
    @Id
    private int id;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
