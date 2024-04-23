package com.example.kanbanspring.config;

import com.example.kanbanspring.dto.KanbanUserDto;
import com.example.kanbanspring.model.KanbanUser;
import org.springframework.context.annotation.Bean;

public class Mapper {

    public static KanbanUserDto toKanbanUserDto(KanbanUser kanbanUser) {
        KanbanUserDto kanbanUserDto = new KanbanUserDto();
        kanbanUserDto.setId(kanbanUser.getId());
        kanbanUserDto.setUserName(kanbanUser.getUserName());
        kanbanUserDto.setEmail(kanbanUser.getEmail());
        return kanbanUserDto;
    }

    public static KanbanUser toKanbanUser(KanbanUserDto kanbanUserDto) {
        KanbanUser kanbanUser = new KanbanUser();
        kanbanUser.setId(kanbanUserDto.getId());
        kanbanUser.setUserName(kanbanUserDto.getUserName());
        kanbanUser.setEmail(kanbanUserDto.getEmail());
        return kanbanUser;
    }

}
