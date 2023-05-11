package org.acme.domain.mapper;

import org.acme.domain.model.Category;
import org.acme.infrastructure.dto.CategoryResponse;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryMapper {
    public static CategoryMapper INSTACE = new CategoryMapper();

    public CategoryResponse toResponse(Category c) {
        return new  CategoryResponse(c.getId(), c.getName(), c.getDescription(), c.getImageUrl());
    }

    public List<CategoryResponse> toResponse(List<Category> cs) {
        return cs.stream().map(this::toResponse).collect(Collectors.toList());
    }

}
