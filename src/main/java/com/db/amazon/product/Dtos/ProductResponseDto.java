package com.db.amazon.product.Dtos;


import lombok.Data;

@Data
public class ProductResponseDto {

    private String name;
    private String description;
    private double price;

    private int stockQuantity;
    private String brand;


    private String category;
    private String weight;
    private String imagedata;
}
