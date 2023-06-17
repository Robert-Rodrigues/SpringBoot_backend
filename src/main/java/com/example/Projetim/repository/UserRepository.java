package com.example.Projetim.repository;

import com.example.Projetim.repository.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    // Métodos personalizados, se necessário
}
