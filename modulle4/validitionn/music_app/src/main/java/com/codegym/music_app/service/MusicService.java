package com.codegym.music_app.service;

import com.codegym.music_app.model.Music;
import com.codegym.music_app.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicService implements IMusicService{

    @Autowired
    private IRepository irepository ;

    @Override
    public Page<Music> findAll(Pageable pageable) {
        return irepository.findAll(pageable);
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
