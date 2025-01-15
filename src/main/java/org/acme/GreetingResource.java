package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.UUID;
import org.acme.control.MyEntityController;
import org.acme.domain.MyEntity;

@Path("/hello")
public class GreetingResource {

    @Inject
    MyEntityController controller;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
    
    @Path("entity")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MyEntity getMyEntity() {
        return controller.create(UUID.randomUUID());
    }
    
    
}
