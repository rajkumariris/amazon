package com.db.amazon.product.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String description;
        private double price;
        private String imageName;
        private String imageType;
        @Lob
        @Column(columnDefinition = "LONGBLOB")
        private byte[] imageData;
        private int stockQuantity;
        @ManyToOne(cascade = CascadeType.PERSIST)

        private Brand brand;

        @ManyToOne(cascade = CascadeType.PERSIST)
        private Category category;
        private String weight;


}
