package com.api.anime.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.anime.entities.Anime;

@Repository
public interface AnimeRepository extends CrudRepository<Anime, Long>{

}
