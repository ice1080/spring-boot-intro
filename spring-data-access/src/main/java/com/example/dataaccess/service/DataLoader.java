package com.example.dataaccess.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataaccess.domain.Album;
import com.example.dataaccess.domain.Artist;
import com.example.dataaccess.repository.AlbumRepository;
import com.example.dataaccess.repository.ArtistRepository;

@Service
public class DataLoader {

	private AlbumRepository albumRepository;
	private ArtistRepository artistRepository;

	@Autowired
	public DataLoader(AlbumRepository albumRepository, ArtistRepository artistRepository) {
		this.albumRepository = albumRepository;
		this.artistRepository = artistRepository;
	}

	@PostConstruct
	private void loadData() {
		Artist killswitch = new Artist("Killswitch Engage", "Metalcore");
		artistRepository.save(killswitch);

		Album atonement = new Album("Atonement");
		atonement.setArtist(killswitch);
		albumRepository.save(atonement);

		Album incarnate = new Album("Incarnate");
		incarnate.setArtist(killswitch);
		albumRepository.save(incarnate);
	}
}
