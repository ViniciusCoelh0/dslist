package com.coelhovinicius.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coelhovinicius.dslist.dto.GameDto;
import com.coelhovinicius.dslist.dto.GameMinDto;
import com.coelhovinicius.dslist.services.GameListService;
import com.coelhovinicius.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDto findById(@PathVariable Long id){
		GameDto result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDto> findAll(){
		List<GameMinDto> result = gameService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}")
	public List<GameMinDto> findByList(@PathVariable Long listId){
		List<GameMinDto> result = gameService.findByList(listId);
		return result;
	}
	
}
