package com.db.amazon.product.Repository;

import com.db.amazon.product.models.cart.cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<cart, Long> {


    cart  findByUserId(Long userId);
}

