package com.example.assigment_day19.controller;

import com.example.assigment_day19.DTO.RegisterDTO;
import com.example.assigment_day19.model.RegisterModel;
import com.example.assigment_day19.service.RegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    // Saya menggunakan post karena register konsepnya create data bukan mengambil data
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDTO DTO) {
        try {

            if (DTO.getUsername() == null || DTO.getUsername().isEmpty()) {
                return ResponseEntity.badRequest().body("Username is required");
            }

            if (DTO.getPassword() == null || DTO.getPassword().isEmpty()) {
                return ResponseEntity.badRequest().body("Password is required");
            }

            if (DTO.getEmail() == null || DTO.getEmail().isEmpty()) {
                return ResponseEntity.badRequest().body("Email is required");
            }

            if (DTO.getAddress() == null || DTO.getAddress().isEmpty()) {
                return ResponseEntity.badRequest().body("Address is required");
            }

            registerService.register(DTO);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Register success");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Internal Server Error");
        }
    }


}

