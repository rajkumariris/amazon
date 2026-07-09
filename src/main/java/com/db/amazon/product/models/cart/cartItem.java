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

    @ManyToOne( cascade = CascadeType.ALL)
    private cart cart;

    @OneToOne
    private Product product;

    private int quantity;
}
