package com.example.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dataaccess.domain.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

	

}
