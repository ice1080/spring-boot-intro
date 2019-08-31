package com.example.dataaccess.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Album {
	

	@Id
	@GeneratedValue
	private long id;

	private String name;
	
	@ManyToOne
	private Artist artist;
	
	private Album() {
		
	}

	public Album(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return String.format("Album %s by %s", name, artist);
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
}

