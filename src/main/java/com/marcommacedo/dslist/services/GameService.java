package com.marcommacedo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcommacedo.dslist.dto.GameMinDTO;
import com.marcommacedo.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> getAll() {
		var result = gameRepository.findAll();
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
