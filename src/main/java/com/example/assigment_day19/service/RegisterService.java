package com.example.assigment_day19.service;

import com.example.assigment_day19.DTO.RegisterDTO;
import com.example.assigment_day19.model.RegisterModel;
import com.example.assigment_day19.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterService {

    private final UserRepository userRepository;

    @Autowired
    public RegisterService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    private List<RegisterDTO> registers = new ArrayList<>();
    private Long idCounter = 1L;

    public void register(RegisterDTO dto) {
        dto.setId(idCounter++);
        RegisterModel model = new RegisterModel();
        model.setUsername(dto.getUsername());
        model.setPassword(dto.getPassword());
        model.setAddress(dto.getAddress());
        model.setEmail(dto.getEmail());
        model.setAge(dto.getAge());

        userRepository.save(model);
        registers.add(dto);
    }

    public RegisterDTO getById(Long id) {
        for (RegisterDTO dto : registers) {
            if (dto.getId().equals(id)) {
                return dto;
            }
        }
        return null;
    }

    public List<RegisterDTO> getAll() {
        return registers;
    }
}
