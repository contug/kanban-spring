package com.example.kanbanspring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "kanban_user")
@Getter
@Setter
public class KanbanUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String email;

    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "kanban_user_task",
            joinColumns = @JoinColumn(name = "kanban_user_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id")
    )
    private List<Task> assignedTasks;


}
