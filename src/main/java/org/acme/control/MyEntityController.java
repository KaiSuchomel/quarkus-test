package org.acme.control;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.UUID;
import org.acme.domain.MyEntity;

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
    
}
