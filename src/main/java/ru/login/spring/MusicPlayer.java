package ru.login.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MusicPlayer {

    private List<Music> musicList1 = new ArrayList<>();
    private List<Music> musicList2 = new ArrayList<>();

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic")List<Music> musicList1,@Qualifier("classicalMusic") List<Music> musicList2) {
        this.musicList1 = musicList1;
        this.musicList2 = musicList2;
    }

    public String playMusic(){
        return "Playing: " + .getSong();
    }
}
