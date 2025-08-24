package com.coelhovinicius.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coelhovinicius.dslist.dto.GameListDto;
import com.coelhovinicius.dslist.entities.GameList;
import com.coelhovinicius.dslist.projections.GameMinProjection;
import com.coelhovinicius.dslist.repositories.GameListRepository;
import com.coelhovinicius.dslist.repositories.GameRepository;

//Registrando como componente do sistema
//Component ou
@Service
public class GameListService {
	 
	 @Autowired
	 private GameListRepository gameListRepository;
	 
	 @Autowired
	 private GameRepository gameRepository;

	 @Transactional(readOnly = true)
	 public List<GameListDto> findAll(){
		 List<GameList> result = gameListRepository.findAll();
		 List<GameListDto> listDto = result.stream().map(g -> new GameListDto(g)).toList();
		 return listDto;
		 
	 }
	 
	 @Transactional
	 public void move(Long listId, int sourceIndex, int destinationIndex) {
		 
		 List<GameMinProjection> list = gameRepository.searchByList(listId);
		 
		 GameMinProjection obj = list.remove(sourceIndex);
		 list.add(destinationIndex, obj);
		 
		 int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		 int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		 	
		 for(int i = min; i <= max; i++) {
			 gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		 }
		 
	 }
	 
	 
	 
}
