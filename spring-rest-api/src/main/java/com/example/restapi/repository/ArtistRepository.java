package com.example.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.domain.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{

}
