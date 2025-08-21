package com.coelhovinicius.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coelhovinicius.dslist.dto.GameListDto;
import com.coelhovinicius.dslist.entities.GameList;
import com.coelhovinicius.dslist.repositories.GameListRepository;

//Registrando como componente do sistema
//Component ou
@Service
public class GameListService {
	 
	 @Autowired
	 private GameListRepository gameListRepository;

	 @Transactional(readOnly = true)
	 public List<GameListDto> findAll(){
		 List<GameList> result = gameListRepository.findAll();
		 List<GameListDto> listDto = result.stream().map(g -> new GameListDto(g)).toList();
		 return listDto;
		 
	 }
}
