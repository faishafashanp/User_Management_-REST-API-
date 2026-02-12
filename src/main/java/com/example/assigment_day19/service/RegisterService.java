package com.example.assigment_day19.service;

import com.example.assigment_day19.DTO.RegisterDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterService {

    private List<RegisterDTO> registers = new ArrayList<>();
    private Long idCounter = 1L;

    public void register(RegisterDTO dto) {
        dto.setId(idCounter++);
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
