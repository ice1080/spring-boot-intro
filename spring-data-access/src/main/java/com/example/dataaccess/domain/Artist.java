package com.example.dataaccess.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String genre;
	
	@OneToMany( mappedBy = "artist")
	private List<Album> albums;
	
	private Artist() {
		
	}
	
	public Artist(String name, String genre) {
		this.setName(name);
		this.setGenre(genre);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public String toString() {
		return String.format("Artist %s of genre %s", name, genre);
	}

}
