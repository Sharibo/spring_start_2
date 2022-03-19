package com.gmail.alexejkrawez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    //IoC
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }



    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
