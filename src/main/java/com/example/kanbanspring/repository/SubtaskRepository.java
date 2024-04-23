package com.example.kanbanspring.repository;

import com.example.kanbanspring.model.Subtask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubtaskRepository extends JpaRepository<Subtask, Long> {
}
