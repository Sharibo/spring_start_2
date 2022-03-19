package com.gmail.alexejkrawez;

import org.springframework.beans.factory.annotation.Qualifier;


public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;


    public MusicPlayer(@Qualifier("classicalMusicBean") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("countryMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }
    public String playMusic(MusicStyle style) {
        switch (style) {
            case CLASSICAL:
                return this.music1.getSongs()[(int) (Math.random()*3)];
            case ROCK:
                return this.music2.getSongs()[(int) (Math.random()*3)];
            case COUNTRY:
                return this.music3.getSongs()[(int) (Math.random()*3)];
            default:
                return this.music1.getSongs()[(int) (Math.random()*3)];
        }
    }

}
