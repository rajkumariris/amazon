package com.db.amazon.product.service;

import com.db.amazon.product.Dtos.ProductRequestDto;
import com.db.amazon.product.Dtos.ProductResponseDto;
import com.db.amazon.product.models.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    public void createProduct(ProductRequestDto productRequest, MultipartFile image) throws IOException;
    public List<ProductResponseDto> getAllProduct();

    public List<ProductResponseDto> searchProduct(String keyword, String description);

    public List<ProductResponseDto> filterByCategory(String category);

    public ProductResponseDto getDetails(Long id);
}
