package org.example.springProject.repositories;

import org.example.springProject.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/// Lembrete: JpaRepository vem do spring e está relacionado ao banco de dados, cansultas no banco

public interface GameRepository extends JpaRepository<Game, Long> {
}
