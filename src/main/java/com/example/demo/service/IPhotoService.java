package com.example.demo.service;



import java.util.Optional;

import com.example.demo.model.Photo;



public interface IPhotoService {

	public Iterable<Photo> getAll();
	
	public Optional<Photo> getById(int id);
	
	public Photo create(Photo photo);
	
	public Optional<Photo> update(int id, Photo photo);
	
	public Boolean delete(int id);
}
