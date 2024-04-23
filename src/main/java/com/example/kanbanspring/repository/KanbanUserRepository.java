package com.example.kanbanspring.repository;

import com.example.kanbanspring.model.KanbanUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KanbanUserRepository extends JpaRepository<KanbanUser, Long> {
}
