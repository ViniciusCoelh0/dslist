package com.coelhovinicius.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coelhovinicius.dslist.dto.GameListDto;
import com.coelhovinicius.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDto> findAll(){
		List<GameListDto> result = gameListService.findAll();
		return result;
	}
	
}
