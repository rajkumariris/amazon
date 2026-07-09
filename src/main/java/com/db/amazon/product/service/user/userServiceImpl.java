package com.db.amazon.product.service.user;

import com.db.amazon.product.Dtos.User.UserRequestDto;
import com.db.amazon.product.Repository.UserRepository;
import com.db.amazon.product.models.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserRequestDto userDetails) {

        User user = new User();
        user.setName(userDetails.getName());
        user.setGender(userDetails.getGender());
        user.setPhoneNo(userDetails.getPhoneNo());
      return userRepository.save(user);

    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
