package com.springapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.GenresDAO;
import com.springapp.entity.Genres;
@Service
public class GenresServiceImpl implements GenresService {
	
	@Autowired
	private GenresDAO genresDAO;
	
	@Transactional
	@Override
	public List<Genres> getGenres() {
		// TODO Auto-generated method stub
		return genresDAO.getGenres();
	}
	@Transactional
	@Override
	public void saveGenre(Genres genre) {
		genresDAO.saveGenre(genre);

	}
	@Transactional
	@Override
	public Genres getGenre(int id) {
		// TODO Auto-generated method stub
		return genresDAO.getGenre(id);
	}
	@Transactional
	@Override
	public List<String> getGenresNames() {
		List<Genres> genresName = genresDAO.getGenres();
		List<String> genresNameList = new ArrayList<>();
		for(Genres i:genresName) {
			
			genresNameList.add(i.getGenre_name());
		}
			
		return genresNameList;
	}

}
