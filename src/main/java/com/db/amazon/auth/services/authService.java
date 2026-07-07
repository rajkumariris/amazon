//package com.db.amazon.auth.services;
//
//import com.db.amazon.auth.dtos.RegisterDto;
//import com.db.amazon.auth.models.Role;
//import com.db.amazon.auth.models.User;
//import com.db.amazon.auth.repositories.AuthRepository;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class authService {
//
//    @Autowired
//    private AuthRepository authRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//      public String  register(RegisterDto registerDto){
//
//          String email = registerDto.getEmail();
//
//            if (email == null || email.isEmpty()) {
//                return "Email is required";
//            }
//            if(authRepository.findByEmail(email) != null) {
//                return "Email already exists";
//            }
//
//
//            User user = User.builder()
//                    .username(registerDto.getUsername())
//                    .email(registerDto.getEmail())
//                    .password(passwordEncoder.encode(registerDto.getPassword()))
//                    .role(Role.USER) // Set the default role to USER
//                    .build();
//
//            authRepository.save(user);
//            return "Registration successful";
//       }
//
//
//        // Implement registration logic here
//        // For example, save the user to the database
//}
