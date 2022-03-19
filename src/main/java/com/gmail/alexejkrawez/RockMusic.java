package com.gmail.alexejkrawez;

public class RockMusic implements Music {

    String[] songsRock = new String[]{"Wind cries Mary", "We Will Rock You", "Jerk It Out"};

    @Override
    public String[] getSongs() {
        return songsRock;
    }
}
