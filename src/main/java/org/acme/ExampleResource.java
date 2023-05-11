package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TestResponse list() {
        return new TestResponse("Hello from RESTEasy Reactive");
    }
}
