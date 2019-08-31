package com.example.dataaccess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataaccess.domain.Album;
import com.example.dataaccess.repository.AlbumRepository;

@Service
public class AlbumService {

	private AlbumRepository albumRepository;
	
	@Autowired
	public AlbumService(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	}
	
	public List<Album> list() {
		return albumRepository.findAllByOrderByName();
	}
}
