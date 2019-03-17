package com.example14.defaultstaticmethod;

public interface Learnable {
    int STUDY_TIME = 8;
    void read(String bookName);
    int test(String courseName);

    static int getLeftTime(int hours) {
        return hours - STUDY_TIME;
    }
}
