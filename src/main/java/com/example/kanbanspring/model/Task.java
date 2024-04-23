package com.example.kanbanspring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    private KanbanUser author;

    @ManyToMany(mappedBy = "assignedTasks", fetch = FetchType.LAZY)
    private List<KanbanUser> assignees;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Subtask> subtasks;

}
