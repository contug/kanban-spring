package com.example.kanbanspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.example.kanbanspring.model.Task}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto implements Serializable {
    private Long id;
    private String title;
    private String description;
}
