package com.startjava.lesson1.calculator.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число и нажите Enter");
        int firstNumber = console.nextInt();
        System.out.println("Введите один из символов математической операции (+,-,*,/,^,%) и нажмите Enter");
        char operator = console.next().charAt(0);
        System.out.println("Введите второе число и нажмите Enter");
        int secondNumber = console.nextInt();
        int operationResult = 0;

        if(operator == '+') {
            operationResult = firstNumber + secondNumber;
        } else if(operator == '-') {
            operationResult = firstNumber - secondNumber;
        } else if(operator == '*') {
            operationResult = firstNumber * secondNumber;
        } else if(operator == '/') {
            operationResult = firstNumber / secondNumber;
        } else if(operator == '%') {
            operationResult = firstNumber % secondNumber;
        } else if(operator == '^') {
            if(secondNumber == 0) {
                operationResult = 0;
            } else if(secondNumber == 1) {
                operationResult = firstNumber;
            } else if(secondNumber > 1) {
                operationResult = firstNumber;
                for(int i = secondNumber; i > 1; i--) {
                    operationResult *= firstNumber;
                }
            System.out.println("Результат =" + operationResult);
            }
        }
    }
}