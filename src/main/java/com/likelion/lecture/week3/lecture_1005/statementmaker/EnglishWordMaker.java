package com.likelion.lecture.week3.lecture_1005.statementmaker;

public class EnglishWordMaker implements WordMaker {
    @Override
    public String getWordMaker(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
