package com.db.amazon.product.service;

import com.db.amazon.product.Dtos.ProductRequestDto;
import com.db.amazon.product.models.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ProductService {

    public void createProduct(ProductRequestDto productRequest, MultipartFile image) throws IOException;
}
