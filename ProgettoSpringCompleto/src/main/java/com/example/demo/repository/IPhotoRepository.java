package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Photo;



@Repository
public interface IPhotoRepository extends CrudRepository<Photo, Integer> {

}
