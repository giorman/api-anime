package com.api.anime.services;

import java.util.List;

import com.api.anime.entities.Anime;

public interface AnimeServiceInterface {
	
	List<Anime> lista();
	
	Anime guardarAnime(Anime anime);
	
	void eliminarAnime(Long id);

}
