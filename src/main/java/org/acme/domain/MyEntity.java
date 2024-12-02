package org.acme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import java.util.UUID;

@Entity
public class MyEntity {

    @Id
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void getXXX() {
    }

    @PrePersist
    public void setId(){
        id = UUID.randomUUID();
    }
    
    public String getModelType() {
        return "MyEntity";
    }
}
