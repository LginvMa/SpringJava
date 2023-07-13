package ru.login.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private String song1 = "Bah - Sonata №9";
    private String song2 = "Mocart - Day of night";
    private String song3 = "Chakowskiy - Double Tea";

    List<String> classicalList = new ArrayList<>(Arrays.asList(song1, song2, song3));


    public List<String> getClassicalList() {
        return classicalList;
    }

    @Override
    public void getSong(){
        System.out.println(getClassicalList());
    }
}
