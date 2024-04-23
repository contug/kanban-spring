package com.example.kanbanspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.example.kanbanspring.model.KanbanUser}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KanbanUserDto implements Serializable {
    private Long id;
    private String userName;
    private String email;
}
