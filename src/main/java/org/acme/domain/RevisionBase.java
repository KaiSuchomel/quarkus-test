package org.acme.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@MappedSuperclass
public abstract class RevisionBase implements Serializable {

    @Schema(description = "User Name of the Revision")
    private String userName;
    
    @Schema(description = "ChangeDate of the Revision")
    private OffsetDateTime changeDate;
    
    @Schema(description = "Timestamp of the Revision")
    private long timestamp;

    protected RevisionBase() {
        this.changeDate = OffsetDateTime.now();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String aUserName) {
        this.userName = aUserName;
    }

    public OffsetDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(OffsetDateTime aChangeDate) {
        this.changeDate = aChangeDate;
    }

    public abstract int getId();

    public abstract void setId(int aId);

    @Transient
    public Date getRevisionDate() {
        return new Date(timestamp);
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long aTimestamp) {
        timestamp = aTimestamp;
    }
}
