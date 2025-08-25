package com.example.wipro.controllers;

import com.example.wipro.entities.User;
import com.example.wipro.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }

    // Feign calls to Property Service
    @GetMapping("/properties")
    public List<Map<String, Object>> getAllProperties() {
        return userService.fetchAllProperties();
    }

    @GetMapping("/properties/{propertyId}")
    public Map<String, Object> getPropertyById(@PathVariable Long propertyId) {
        return userService.fetchPropertyById(propertyId);
    }
}
