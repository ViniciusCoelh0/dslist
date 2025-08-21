package com.coelhovinicius.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelhovinicius.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
