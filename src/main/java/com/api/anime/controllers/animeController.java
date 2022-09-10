package com.api.anime.controllers;
import com.api.anime.services.AnimeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.anime.entities.Anime;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("animes")
public class animeController {
	private String balanceadorTest;

	@Autowired
	private AnimeServiceInterface animeService;
	
	
	@GetMapping("consultar")
	public ResponseEntity<?> consultar(){
		return ResponseEntity.ok(animeService.lista());
	}
	
	@PostMapping("guardar")
	public ResponseEntity<?> guardar(@RequestBody Anime anime){
	
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(animeService.guardarAnime(anime));
	
	}
	
	@PutMapping("actualizar")
	public ResponseEntity<?> actualizar(@RequestBody Anime anime){
	
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(animeService.guardarAnime(anime));
	
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		
		animeService.eliminarAnime(id);
		return ResponseEntity.ok().build();
				
	}
	
	
	
	
}
