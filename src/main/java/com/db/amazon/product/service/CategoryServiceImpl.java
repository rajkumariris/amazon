//package com.db.amazon.product.service;
//
//
//import com.db.amazon.product.Dtos.CategoryRequest;
//import com.db.amazon.product.Dtos.CategoryResponseDto;
//import com.db.amazon.product.Repository.CatagoryRepository;
//import com.db.amazon.product.models.Category;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CategoryServiceImpl implements CategoryService {
//
//    @Autowired
//    CatagoryRepository catagoryRepository;
//
//    @Override
//    public CategoryResponseDto create(CategoryRequest request) {
//        if(catagoryRepository.existsBySlug(request.getSlug())){
//            throw new RuntimeException("Category with the same slug already exists");
//        }
//
//        Category parent = null;
//
//        Category category = Category.builder().
//                name(request.getName())
//                .description(request.getDescription())
//                .slug(request.getSlug())
//                .parentCategory(parent)
//                .build();
//        catagoryRepository.save(category);
//
//        return CategoryResponseDto.builder()
//                .id(category.getId())
//                .name(category.getName())
//                .slug(category.getSlug())
//                .parentId(category.getParentCategory())
//
//    }
//
//    @Override
//    public List<CategoryResponseDto> getAll() {
//        return List.of();
//    }
//
//    @Override
//    public CategoryResponseDto getById(Long id) {
//        return null;
//    }
//
//    @Override
//    public CategoryResponseDto update(Long id, CategoryRequest request) {
//        return null;
//    }
//
//    @Override
//    public void delete(Long id) {
//
//    }
//}
