package com.db.amazon.product.controllers;


import com.db.amazon.product.Dtos.ProductRequestDto;
import com.db.amazon.product.models.Product;
import com.db.amazon.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping(value = "/create" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void createProduct(@RequestPart("product") ProductRequestDto productRequest, @RequestPart("image") MultipartFile image) throws IOException {
        productService.createProduct(productRequest, image);
    }

    public void getProduct(){};

    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    public void deleteProduct(){

    }

    public void updateProduct(){

    }
}

