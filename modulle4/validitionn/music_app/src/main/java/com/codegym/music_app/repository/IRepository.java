package com.codegym.music_app.repository;

import com.codegym.music_app.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository<Music, Integer> {
}
