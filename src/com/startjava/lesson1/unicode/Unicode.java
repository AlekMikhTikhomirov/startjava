package com.startjava.lesson1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for(short i = 33; i <= 126; i++) {
            char symbol = (char) i;
            System.out.print(symbol);
        }
    }
}