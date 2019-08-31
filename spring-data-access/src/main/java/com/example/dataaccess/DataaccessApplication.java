package com.example.dataaccess;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dataaccess.domain.Album;
import com.example.dataaccess.repository.AlbumRepository;
import com.example.dataaccess.service.DataLoader;

@SpringBootApplication
public class DataaccessApplication {

	private static final Logger logger = LoggerFactory.getLogger(DataaccessApplication.class);

	@Autowired
	AlbumRepository albumRepository;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(DataaccessApplication.class, args);
	}

	@PostConstruct
	void seeAlbums() {
		logger.info("seeAlbums method called");
		for (Album album : albumRepository.findAll()) {
			logger.info(album.toString());
		}
	}
}
