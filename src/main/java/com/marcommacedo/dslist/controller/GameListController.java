package com.marcommacedo.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcommacedo.dslist.dto.GameListDTO;
import com.marcommacedo.dslist.dto.GameMinDTO;
import com.marcommacedo.dslist.services.GameListService;
import com.marcommacedo.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> getAll() {
		var result = gameListService.getAll();
		return result;
	}
	
	@GetMapping(value = "/{idList}/games")
	public List<GameMinDTO> getByListId(@PathVariable Long idList) {
		var result = gameService.getByListId(idList);
		return result;
	}
}
