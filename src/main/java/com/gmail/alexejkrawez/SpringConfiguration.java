package com.gmail.alexejkrawez;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public CountryMusic countryMusic() {
        return new CountryMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic(), countryMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
