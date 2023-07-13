package ru.login.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{
    private String song1 = "AC/DC - highway to hell";
    private String song2 = "Nirvana - Teen Spirit";
    private String song3 = "Pornfilms - Sorry. Good bay. Hello";

    List<String> rockList = new ArrayList<>(Arrays.asList(song1, song2, song3));

    public List<String> getRockList() {
        return rockList;
    }

    @Override
    public void getSong() {
        System.out.println(getRockList());
    }

}
