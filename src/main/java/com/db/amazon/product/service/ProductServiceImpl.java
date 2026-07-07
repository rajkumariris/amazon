package com.db.amazon.product.service;

import com.db.amazon.product.Dtos.ProductRequestDto;
import com.db.amazon.product.Repository.ProductRepository;
import com.db.amazon.product.models.Brand;
import com.db.amazon.product.models.Category;
import com.db.amazon.product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequestDto productRequest, MultipartFile image) throws IOException {

        Category category = new Category();
        category.setName(productRequest.getCategory());

        Brand brand = new Brand();
        brand.setName(productRequest.getBrand());

            Product product = Product.builder()
                    .name(productRequest.getName())
                    .description(productRequest.getDescription())
                    .price(productRequest.getPrice())
                    .imageName(image.getOriginalFilename())
                    .imageType(image.getContentType())
                    .imageData(image.getBytes())
                    .stockQuantity(productRequest.getStockQuantity())
                    .category(category)
                    .brand(brand)
                    .imageData(image.getBytes()) // Assuming you want to store the image as bytes
                    .build();

            productRepository.save(product);
    }
}
