package com.example.kanbanspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.example.kanbanspring.model.Board}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto implements Serializable {
    private Long id;
    private String name;
    private String description;
}
