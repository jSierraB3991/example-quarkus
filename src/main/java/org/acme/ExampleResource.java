package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.infrastructure.dto.TestResponse;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Path("/hello")
public class ExampleResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TestResponse list() {
        return new TestResponse("Hello from RESTEasy Reactive");
    }
}
