package org.acme.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CategoryResponse {
    private String id;
    private String name;
    private String description;
    private String imageUrl;
}
