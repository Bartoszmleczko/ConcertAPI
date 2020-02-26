package com.springapp.service;

import java.util.List;

import com.springapp.entity.Genres;

public interface GenresService {
	public List<Genres> getGenres();
	public void saveGenre(Genres genre);
	public Genres getGenre(int id);
	public List<String> getGenresNames();
}
