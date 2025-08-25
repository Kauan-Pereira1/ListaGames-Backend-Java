package com.kauan_pereira1.Lista.Games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauan_pereira1.Lista.Games.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
