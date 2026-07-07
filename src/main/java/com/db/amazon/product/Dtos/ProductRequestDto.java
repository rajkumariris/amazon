package com.db.amazon.product.Dtos;

import com.db.amazon.product.models.Brand;
import com.db.amazon.product.models.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
public class ProductRequestDto {

    private String name;
    private String description;
    private double price;

    private int stockQuantity;
    private String brand;


    private String category;
    private String weight;
}
