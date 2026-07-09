package com.db.amazon.product.service;

import com.db.amazon.product.Dtos.ProductRequestDto;
import com.db.amazon.product.Dtos.ProductResponseDto;
import com.db.amazon.product.Repository.ProductRepository;
import com.db.amazon.product.models.Brand;
import com.db.amazon.product.models.Category;
import com.db.amazon.product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<ProductResponseDto> getAllProduct() {
       List<Product> products= productRepository.findAll();
    List<ProductResponseDto> productResponseDtoList = new ArrayList<>();
       for(Product product: products) {
           ProductResponseDto productResponseDto = new ProductResponseDto();
           productResponseDto.setName(product.getName());
           productResponseDto.setDescription(product.getDescription());
           productResponseDto.setPrice(product.getPrice());
           productResponseDto.setImagedata(product.getImageName());
           String catName = product.getCategory().getName();
           productResponseDto.setCategory(catName);
           productResponseDto.setBrand(product.getBrand().getName());
           productResponseDtoList.add(productResponseDto);
       }
        return productResponseDtoList;
    }

    @Override
    public List<ProductResponseDto> searchProduct(String keyword, String description) {
//       List<Product> searchProducts =  productRepository.findByNameContainingIgnoreCase(keyword);
        List<Product> searchProducts = productRepository.searchproduct(keyword, description);
       List<ProductResponseDto> searchProductsDtos = new ArrayList<>();
       for (int i =0;i<searchProducts.size();i++){

           ProductResponseDto productDto =new ProductResponseDto();
           productDto.setName(searchProducts.get(i).getName());
           productDto.setBrand(searchProducts.get(i).getBrand().getName());
           productDto.setDescription(searchProducts.get(i).getDescription());

           searchProductsDtos.add(productDto);
       }

       return searchProductsDtos;
    }

    @Override
    public List<ProductResponseDto> filterByCategory(String category) {

        List<Product> products = productRepository.findProductwithCategory();
        return List.of();
    }


}
