package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Customer;
import com.springapp.entity.Genres;

public interface GenresDAO {
public List<Genres> getGenres();
	
	public void saveGenre(Genres theGenre);
	
	public Genres getGenre(int id);
	
	
}
