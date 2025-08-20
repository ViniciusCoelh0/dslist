package com.coelhovinicius.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelhovinicius.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	
}
