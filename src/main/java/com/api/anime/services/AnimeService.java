package com.api.anime.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.anime.entities.Anime;
import com.api.anime.repository.AnimeRepository;

@Service
public class AnimeService implements AnimeServiceInterface {
	
	@Autowired
	AnimeRepository animeRepository;

	@Override
	public List<Anime> lista() {
		
		return (List<Anime>) animeRepository.findAll();
	}

	@Override
	public void eliminarAnime(Long id) {
		
		animeRepository.deleteById(id);;
	}

	@Override
	public Anime guardarAnime(Anime anime) {
		anime.setFechaIngreso(LocalDate.now());
		return animeRepository.save(anime);
	}
	

}
