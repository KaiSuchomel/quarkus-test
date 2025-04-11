package org.acme.control;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.acme.domain.MyEntity;
import org.acme.domain.Revision;

@RequestScoped
public class MyEntityController {
    
    @Inject
    EntityManager em;
    
    @Transactional
    public MyEntity create(UUID aId){
        MyEntity result = new MyEntity();
        result.setFirstIdField(aId);
        result.setSecondIdField(aId);
        result.setName("MyTests");
        em.persist(result);
        return result;
    }
    
    @Transactional
    public Revision createRevision(Integer aId){
        Revision result = new Revision();
        result.setId(aId);
        result.setChangeDate(OffsetDateTime.now());
        result.setTimestamp(0);
        result.setUserName("User");
        em.persist(result);
        return result;
    }
    
    
    
}
