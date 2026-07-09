package com.db.amazon.product.service.user;

import com.db.amazon.product.Dtos.User.UserRequestDto;
import com.db.amazon.product.models.User.User;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService{
    @Override
    public User createUser(UserRequestDto userDetails) {


        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }
}
