//package com.example.restapi.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.restapi.domain.Artist;
//import com.example.restapi.service.ArtistService;
//
//@RestController
//@RequestMapping("/artists")
//public class ArtistController {
//
//	private ArtistService artistService;
//
//	@Autowired
//	public ArtistController(ArtistService artistService) {
//		this.artistService = artistService;
//	}
//
//	@GetMapping()
//	public Iterable<Artist> list() {
//		return artistService.list();
//	}
//
//	@PostMapping()
//	public Artist create(@RequestBody Artist artist) {
//		return artistService.create(artist);
//	}
//
//	@GetMapping("/{id}")
//	public Artist read(@PathVariable(value = "id") long id) {
//		return artistService.read(id);
//	}
//
//	@PutMapping("/{id}")
//	public Artist update(@PathVariable(value = "id") long id, @RequestBody Artist artist) {
//		return artistService.update(id, artist);
//	}
//
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable(value = "id") long id) {
//		artistService.delete(id);
//	}
//}
