package org.acme.domain;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class MySuperBaseEntity {

    @Id
    private UUID firstIdField;
    @Id
    private UUID secondIdField;

    public UUID getFirstIdField() {
        return firstIdField;
    }

    public UUID getSecondIdField() {
        return secondIdField;
    }

    public void setFirstIdField(UUID firstIdField) {
        this.firstIdField = firstIdField;
    }

    public void setSecondIdField(UUID secondIdField) {
        this.secondIdField = secondIdField;
    }

    @Override
    public String toString() {
        return "MySuperBaseEntity{" + "firstIdField=" + firstIdField + ", secondIdField=" + secondIdField + '}';
    }

}
