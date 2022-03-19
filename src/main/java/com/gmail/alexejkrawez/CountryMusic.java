package com.gmail.alexejkrawez;

public class CountryMusic implements Music {

    String[] songsCountry = new String[] {"Honey, I'm Good", "Hillbilly Bone", "Workin' for a Livin'"};

    @Override
    public String[] getSongs() {
        return songsCountry;
    }
}
