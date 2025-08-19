package com.marcommacedo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcommacedo.dslist.dto.GameDTO;
import com.marcommacedo.dslist.dto.GameMinDTO;
import com.marcommacedo.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> getAll() {
		var result = gameRepository.findAll();
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO getById(Long id) {
		var result = gameRepository.findById(id).get();
		
		return new GameDTO(result);
	}
}
