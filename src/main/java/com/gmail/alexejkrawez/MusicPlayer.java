package com.gmail.alexejkrawez;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    //IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: ");
        for (Music musicGenre : musicList) {
            System.out.println("- " + musicGenre.getSong());
        }
    }
}
