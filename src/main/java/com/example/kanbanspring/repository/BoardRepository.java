package com.example.kanbanspring.repository;

import com.example.kanbanspring.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
