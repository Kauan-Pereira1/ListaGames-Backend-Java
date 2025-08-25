package com.kauan_pereira1.Lista.Games.dto;

import com.kauan_pereira1.Lista.Games.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {		
	}

	public GameListDTO(GameList entity ) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
