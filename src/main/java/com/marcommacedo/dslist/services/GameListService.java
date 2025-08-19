package com.marcommacedo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcommacedo.dslist.dto.GameListDTO;
import com.marcommacedo.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> getAll() {
		var result = gameListRepository.findAll();
		
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
