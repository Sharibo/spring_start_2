package com.gmail.alexejkrawez;

public class ClassicalMusic implements Music {

    String[] songsClassical = new String[] {"Hungarian Rhapsody", "Libertango", "Die Walküre - Ride of the Valkyries"};

    @Override
    public String[] getSongs() {
        return songsClassical;
    }
}
