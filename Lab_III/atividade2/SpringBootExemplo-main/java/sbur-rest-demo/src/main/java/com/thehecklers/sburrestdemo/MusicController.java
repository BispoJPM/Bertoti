package com.thehecklers.sburrestdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/musics")
public class MusicController {
    private final List<Music> musicList = new ArrayList<>();
    private int currentId = 1; 

    @GetMapping
    public List<Music> getAllMusics() {
        return musicList;
    }

    @GetMapping("/{id}")
    public Music getMusicById(@PathVariable String id) {
        return musicList.stream()
                .filter(music -> music.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Música não encontrada"));
    }

    @PostMapping
    public Music addMusic(@RequestBody Music music) {
        music.setId(String.valueOf(currentId++));
        musicList.add(music);
        return music;
    }

    @PutMapping("/{id}")
    public Music updateMusic(@PathVariable String id, @RequestBody Music updatedMusic) {
        Music existingMusic = getMusicById(id);
        existingMusic.setTitle(updatedMusic.getTitle());
        existingMusic.setArtist(updatedMusic.getArtist());
        existingMusic.setAlbum(updatedMusic.getAlbum());
        existingMusic.setDuration(updatedMusic.getDuration());
        return existingMusic;
    }

    @DeleteMapping("/{id}")
    public void deleteMusic(@PathVariable String id) {
        Music music = getMusicById(id);
        musicList.remove(music);
    }
}