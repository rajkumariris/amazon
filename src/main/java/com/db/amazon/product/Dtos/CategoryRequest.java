package com.db.amazon.product.Dtos;

import lombok.Data;

@Data
public class CategoryRequest {
    private String name;

    private String slug;

    private  String description;

    private Long parentId;
}
