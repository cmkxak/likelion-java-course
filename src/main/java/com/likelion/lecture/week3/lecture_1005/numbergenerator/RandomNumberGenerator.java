package com.likelion.lecture.week3.lecture_1005.numbergenerator;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int) (Math.random() * num);
    }
}
