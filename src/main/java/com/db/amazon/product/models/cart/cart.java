package com.db.amazon.product.models.cart;

import com.db.amazon.product.models.User.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private List<cartItem> items = new ArrayList<>();

    @OneToOne
    private User user;

    private Double totalAmount;
}
