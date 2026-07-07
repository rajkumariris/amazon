package com.db.amazon.product.Dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponseDto {
    private Long id;

    private String name;

    private String slug;

    private Long parentId;
}
