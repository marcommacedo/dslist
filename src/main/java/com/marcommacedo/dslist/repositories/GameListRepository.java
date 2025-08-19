package com.marcommacedo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcommacedo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
