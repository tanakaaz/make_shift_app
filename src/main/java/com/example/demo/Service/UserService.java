// package com.example.demo.Service;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;

// // import java.util.Optional;
// @Service
// // public class UserService{
//     @Autowired
//     private UserRepository userRepo;

//     @Autowired
//     private PasswordEncoder passwordEncoder;

//     public boolean login(String username, String rawPassword){
//         Optional<User> optionalUser = userRepository.findByUsername(username);
//         if (optionalUser.isPresent()){
//             User user = optionalUser.get();
//             return passwordEncoder.matches(rawPassword, user.getPassword());
//         }
//         return false;
//     }
// }