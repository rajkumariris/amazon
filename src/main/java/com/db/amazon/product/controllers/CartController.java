package com.db.amazon.product.controllers;

import com.db.amazon.product.service.cart.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private cartService cartService;

    @PostMapping("/addtocart")
    public void addToCart(@RequestParam Long userId, @RequestParam Long productId, @RequestParam int quantity){


        cartService.addToCart(userId,productId,quantity);
    }
    public void viewCart(){

    }

    public void updateCardQuantity(){

    }

    public void removeFromCart(){

    }


}
