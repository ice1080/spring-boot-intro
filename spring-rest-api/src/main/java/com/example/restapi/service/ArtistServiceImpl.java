//package com.example.restapi.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.persistence.EntityNotFoundException;
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.restapi.domain.Artist;
//import com.example.restapi.repository.ArtistRepository;
//
//@Service
//public class ArtistServiceImpl implements ArtistService {
//
//	private ArtistRepository artistRepository;
//
//	@Autowired
//	public ArtistServiceImpl(ArtistRepository artistRepository) {
//		this.artistRepository = artistRepository;
//	}
//
//	@Override
//	public Iterable<Artist> list() {
//		return artistRepository.findAll();
//	}
//
//	@Override
//	@Transactional
//	public Artist create(Artist artist) {
//		return artistRepository.save(artist);
//	}
//
//	@Override
//	public Artist read(long id) throws EntityNotFoundException {
//		return artistRepository.findById(id)
//				.orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
//	}
//
//	@Override
//	public Artist update(long id, Artist update) throws EntityNotFoundException {
//		Artist artist = artistRepository.findById(id)
//				.orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
//		if (update.getName() != null) {
//			artist.setName(update.getName());
//		}
//		return artistRepository.save(artist);
//	}
//
//	@Override
//	public void delete(long id) {
//		artistRepository.deleteById(id);
//	}
//}
