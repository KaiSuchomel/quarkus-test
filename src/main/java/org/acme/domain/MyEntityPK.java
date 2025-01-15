package org.acme.domain;

import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class MyEntityPK implements Serializable {

    private UUID firstIdField;
    private UUID secondIdField;

    public MyEntityPK(UUID firstIdField, UUID secondIdField) {
        this.firstIdField = firstIdField;
        this.secondIdField = secondIdField;
    }

    public MyEntityPK() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.firstIdField);
        hash = 53 * hash + Objects.hashCode(this.secondIdField);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyEntityPK other = (MyEntityPK) obj;
        if (!Objects.equals(this.firstIdField, other.firstIdField)) {
            return false;
        }
        return Objects.equals(this.secondIdField, other.secondIdField);
    }
    
    
    
}
