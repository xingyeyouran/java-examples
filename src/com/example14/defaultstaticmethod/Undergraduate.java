package com.example14.defaultstaticmethod;

public class Undergraduate implements Learnable, Playable{
    @Override
    public void read(String bookName) {
        // TODO Auto-generated method stub
    }
    @Override
    public int test(String courseName) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void sing(String songName) {
        // TODO Auto-generated method stub
        System.out.println("Performance: " + songName);
    }
}
