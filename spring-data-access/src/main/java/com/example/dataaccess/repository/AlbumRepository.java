package com.example.dataaccess.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.dataaccess.domain.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {

	List<Album> findAllByOrderByName();

}
