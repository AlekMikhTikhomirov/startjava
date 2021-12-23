package com.startjava.lesson1.game.MyFirstGame;

import java.util.Calendar;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        int currentSeconds = rightNow.get(Calendar.SECOND);
        int targetNumber = 0;
        if(currentSeconds % 2 == 0) {
            targetNumber = 100 - currentSeconds;
        } else if(currentSeconds % 2 != 0) {
            targetNumber = 1 + currentSeconds;
        }
        System.out.println("Компьютер загадал целое число от 1 до 100");
        Scanner console = new Scanner(System.in);
        int tryingGuess = 0;

        do {
            System.out.println("Введите ваше предположение и нажмите Enter");
            tryingGuess = console.nextInt();
            if(tryingGuess > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(tryingGuess < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        } while(tryingGuess != targetNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}