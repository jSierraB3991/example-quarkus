package org.acme.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Category {

    private String id;
    private String name;
    private String description;
    private String imageUrl;
}
