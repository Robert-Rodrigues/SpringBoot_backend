package com.example.Projetim.repository;

import com.example.Projetim.repository.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Métodos personalizados, se necessário
}