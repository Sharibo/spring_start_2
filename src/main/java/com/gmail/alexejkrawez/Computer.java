package com.gmail.alexejkrawez;

import java.util.Random;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic(MusicStyle.values()[
                new Random().nextInt(MusicStyle.values().length)]);
    }

}
