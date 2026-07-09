package com.db.amazon.product.service.user;

import com.db.amazon.product.Dtos.User.UserRequestDto;
import com.db.amazon.product.models.User.User;

public interface userService {

    public User createUser(UserRequestDto userDetails);

    public User getUserById(Long userId);

}
