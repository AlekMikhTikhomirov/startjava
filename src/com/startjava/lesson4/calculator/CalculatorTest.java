package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String chooseYesNo;
        do {
            System.out.println("Введите строку в формате: [первое число, пробел, знак математической операции, пробел, второе число (без запятых)]");
            calculator.setMathExpression(console.nextLine());
            calculator.calculate();
            System.out.println("Хотите продолжить вычисления? [yes / no]");
            do {
                chooseYesNo = console.nextLine();
                if (chooseYesNo.equals("yes")) {
                    System.out.println("Продолжим!");
                    break;
                } else {
                    System.out.println("Введите yes или no");
                }
            } while (!chooseYesNo.equals("no"));
        } while (chooseYesNo.equals("yes"));
        System.out.println("До свидания!");
    }
}
