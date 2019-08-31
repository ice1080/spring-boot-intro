package com.example.dataaccess.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dataaccess.service.AlbumService;

@Controller
@RequestMapping("/albums")
public class AlbumController {

	private static final Logger logger = LoggerFactory.getLogger(AlbumController.class);

	private AlbumService albumService;

	@Autowired
	public AlbumController(AlbumService albumService) {
		this.albumService = albumService;
	}

	@RequestMapping("/list")
	public String listAlbums(Model model) {
		model.addAttribute("albums", albumService.list());
		return "album/list";
	}

}
