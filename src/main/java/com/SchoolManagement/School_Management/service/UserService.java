package com.SchoolManagement.School_Management.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.SchoolManagement.School_Management.entity.User;
import com.SchoolManagement.School_Management.repository.UserRepository;

import java.util.List;


@Service
public class UserService {
private final UserRepository userRepo;
private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


public UserService(UserRepository userRepo) {
this.userRepo = userRepo;
}


public User createUser(User user) {
user.setPassword(passwordEncoder.encode(user.getPassword()));
return userRepo.save(user);
}


public User updateUser(Long id, User payload) {
User u = userRepo.findById(id).orElseThrow();
u.setEmail(payload.getEmail());
u.setFullName(payload.getFullName());
// do not overwrite password here unless provided
return userRepo.save(u);
}


public List<User> list() { return userRepo.findAll(); }


public void delete(Long id) { userRepo.deleteById(id); }
}