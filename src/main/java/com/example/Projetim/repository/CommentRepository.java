package com.example.Projetim.repository;

import com.example.Projetim.repository.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Métodos personalizados, se necessário
}
