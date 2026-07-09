package com.db.amazon.product.service.cart;


import org.springframework.web.bind.annotation.RequestParam;

public interface cartService {

    public void addToCart(Long userId, Long productId, int quantity);

}
