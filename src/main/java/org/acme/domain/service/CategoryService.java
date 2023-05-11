package org.acme.domain.service;

import org.acme.infrastructure.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> findAll();
}
