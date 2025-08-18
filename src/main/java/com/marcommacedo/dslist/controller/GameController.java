package com.marcommacedo.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcommacedo.dslist.dto.GameMinDTO;
import com.marcommacedo.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> getAll() {
		var result = gameService.getAll();
		return result;
	}
}
