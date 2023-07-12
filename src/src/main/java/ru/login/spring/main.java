package ru.login.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean",Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic = context.getBean("ClassicalMusicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
