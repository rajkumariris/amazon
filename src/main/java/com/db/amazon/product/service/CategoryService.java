package com.db.amazon.product.service;


import com.db.amazon.product.Dtos.CategoryRequest;
import com.db.amazon.product.Dtos.CategoryResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    CategoryResponseDto create(CategoryRequest request);

    List<CategoryResponseDto> getAll();

    CategoryResponseDto getById(Long id);

    CategoryResponseDto update(Long id, CategoryRequest request);

    void delete(Long id);
}
