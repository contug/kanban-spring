package com.example.kanbanspring.repository;

import com.example.kanbanspring.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
