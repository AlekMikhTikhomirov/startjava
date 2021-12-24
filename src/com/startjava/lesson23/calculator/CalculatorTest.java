package com.startjava.lesson23.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner console = new Scanner(System.in);
        String chooseYesNo;
        do {
            System.out.println("Введите первое число и нажите Enter");
            calculatorOne.setFirstNumber(console.nextInt());
            System.out.println("Введите один из символов математической операции (+,-,*,/,^,%) и нажмите Enter");
            calculatorOne.setOperator(console.next().charAt(0));
            System.out.println("Введите второе число и нажмите Enter");
            calculatorOne.setSecondNumber(console.nextInt());
            calculatorOne.calculate();
            System.out.println("Хотите продолжить вычисления? [yes / no]");
            do {
                chooseYesNo = console.nextLine();
                if(chooseYesNo.equals("yes")) {
                    System.out.println("Продолжим!");
                    break;
                } else if(chooseYesNo.equals("no")) {
                    System.out.println("До свидания!");
                    break;
                } else {
                    System.out.println("Введите yes или no");
                }
            } while(chooseYesNo != "yes" & chooseYesNo != "no");
        } while(chooseYesNo.equals("yes"));
    }
}
