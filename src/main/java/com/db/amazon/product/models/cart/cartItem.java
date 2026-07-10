package com.db.amazon.product.models.cart;

import com.db.amazon.product.models.Product;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class cartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "cart_id")
    private cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
}
