package com.gmail.alexejkrawez;

import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void initClassicalMusic() {
        System.out.println("Doing my initializaion!");
    }

    public void destroyClassicalMusic() {
        System.out.println("Doing my destruction!");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
