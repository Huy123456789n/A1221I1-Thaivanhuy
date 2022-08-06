package com.codegym.music_app.service;

import com.codegym.music_app.model.Music;
import com.codegym.music_app.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicService implements IMusicService{

    @Autowired
    private IRepository irepository ;

    @Override
    public Iterable<Music> findAll() {
        return irepository.findAll();
    }

    @Override
    public Optional<Music> findById(int id) {
        return irepository.findById(id);
    }

    @Override
    public void save(Music music) {
        irepository.save(music);
    }

    @Override
    public void remove(int id) {
    irepository.deleteById(id);
    }
}
