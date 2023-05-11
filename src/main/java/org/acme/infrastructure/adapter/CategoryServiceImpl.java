package org.acme.infrastructure.adapter;

import jakarta.inject.Singleton;
import org.acme.domain.mapper.CategoryMapper;
import org.acme.domain.model.Category;
import org.acme.domain.service.CategoryService;
import org.acme.infrastructure.dto.CategoryResponse;

import java.util.List;
import java.util.UUID;

@Singleton
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<CategoryResponse> findAll() {
        var c = new Category(UUID.randomUUID().toString(), "Peinados para mujer", "Todos los peinados para mujeres", "");
        var c2 = new Category(UUID.randomUUID().toString(), "Barberia", "Manjeo de barbas para hombre", "");
        return CategoryMapper.INSTACE.toResponse(List.of(c, c2));
    }
}
