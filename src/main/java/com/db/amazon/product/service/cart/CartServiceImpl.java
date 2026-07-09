package com.db.amazon.product.service.cart;

import com.db.amazon.product.Repository.ProductRepository;
import org.hibernate.boot.internal.Abstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements cartService{

    @Autowired
    private ProductRepository productRepository;


    @Autowired
    private UserRepository userrepository;

    @Override
    public void addToCart(Long userId, Long productId, int quantity) {



    }
}
