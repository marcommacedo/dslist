package com.marcommacedo.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcommacedo.dslist.dto.GameListDTO;
import com.marcommacedo.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> getAll() {
		var result = gameListService.getAll();
		return result;
	}
}
