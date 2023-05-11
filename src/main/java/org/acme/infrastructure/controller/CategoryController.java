package org.acme.infrastructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.domain.service.CategoryService;
import org.acme.infrastructure.dto.CategoryResponse;

import java.util.List;

@Path("/api/category")
public class CategoryController {
    @Inject
    private CategoryService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CategoryResponse> findAll() {
        return service.findAll();
    }
}
