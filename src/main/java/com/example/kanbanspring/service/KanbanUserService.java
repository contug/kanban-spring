package com.example.kanbanspring.service;

import com.example.kanbanspring.config.Mapper;
import com.example.kanbanspring.dto.KanbanUserDto;
import com.example.kanbanspring.model.KanbanUser;
import com.example.kanbanspring.repository.KanbanUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KanbanUserService {

    private final KanbanUserRepository kanbanUserRepository;

    public KanbanUserService(KanbanUserRepository kanbanUserRepository) {
        this.kanbanUserRepository = kanbanUserRepository;
    }

    public KanbanUserDto getUserById(Long id) {
        Optional<KanbanUser> kanbanUser = kanbanUserRepository.findById(id);
        if (kanbanUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        else {
            return Mapper.toKanbanUserDto(kanbanUser.get());
        }
    }


}
