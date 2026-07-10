package com.db.amazon.product.service.cart;

import com.db.amazon.product.Repository.CartRepository;
import com.db.amazon.product.Repository.ProductRepository;
import com.db.amazon.product.Repository.UserRepository;
import com.db.amazon.product.models.Product;
import com.db.amazon.product.models.User.User;
import com.db.amazon.product.models.cart.cart;
import com.db.amazon.product.models.cart.cartItem;
import org.hibernate.boot.internal.Abstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImpl implements cartService{

    @Autowired
    private ProductRepository productRepository;


    @Autowired
    private UserRepository userrepository;

    @Autowired
    private CartRepository cartRepository;

    @Override
    public void addToCart(Long userId, Long productId, int quantity) {


        User user = userrepository.findById(userId)
                .orElseThrow(()->  new RuntimeException("user not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new RuntimeException("product not found"));


        cart cart = cartRepository.findByUserId(userId);

        cartItem existingCartItem =   cart.getItems()
                .stream().filter(item -> item.getProduct().getId().equals(productId))
                .findFirst().orElse(null);






       Optional<User> user =  userrepository.findById(userId);
       if(user!=null){
         Optional<Product> product=   productRepository.findById(productId);
         if(product!=null){
             cartItem cartItem = new cartItem();
             cartItem.setProduct(product.get());
             cartItem.setQuantity(quantity);
           cart cart =  cartRepository.findByUserId(userId);
           if(cart!=null){
               cart.getItems().add(cartItem);
               cartItem.setCart(cart);
               double prevtotal = cart.getTotalAmount();
               cart.setTotalAmount(prevtotal+product.get().getPrice() * quantity);
               cartRepository.save(cart);

           }
           else{
               cart cart1 = new cart();
               cart1.setUser(user.get());
               cartItem.setCart(cart1);
               cart1.getItems().add(cartItem);

               cart1.setTotalAmount(product.get().getPrice() * quantity);
               cartRepository.save(cart1);
           }
         }
       }
    }
}
