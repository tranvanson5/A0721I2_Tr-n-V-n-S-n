package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
   List<Music> findAll();
   Music findById(int id);
   void save();
   void delete(int id);
}
