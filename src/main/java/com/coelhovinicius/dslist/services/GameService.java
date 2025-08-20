package com.coelhovinicius.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coelhovinicius.dslist.dto.GameMinDto;
import com.coelhovinicius.dslist.entities.Game;
import com.coelhovinicius.dslist.repositories.GameRepository;

//Registrando como componente do sistema
//Component ou
@Service
public class GameService {
	 
	 @Autowired
	 private GameRepository gameRepository;
	 
	 public List<GameMinDto> findAll(){
		 List<Game> result = gameRepository.findAll();
		 List<GameMinDto> dto = result.stream().map(g -> new GameMinDto(g)).toList();
		 return dto;
		 
	 }
}
