package ru.login.spring;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){    }

    public static ClassicalMusic getClassiccalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong(){
        return "Bah - Sonata №9";
    }
}
