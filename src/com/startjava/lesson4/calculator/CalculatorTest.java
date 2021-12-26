package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner console = new Scanner(System.in);
        String chooseYesNo;
        String mathExpression;
        do {
            System.out.println("Введите строку в формате: [первое число, пробел, знак математической операции, пробел, второе число (без запятых)]");
            mathExpression = console.nextLine();
            String[] expressionParts = mathExpression.split(" ");
            calculatorOne.setFirstNumber(Integer.parseInt(expressionParts[0]));
            calculatorOne.setOperator(expressionParts[1].charAt(0));
            calculatorOne.setSecondNumber(Integer.parseInt(expressionParts[2]));
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
            } while(chooseYesNo != "no");
        } while(chooseYesNo.equals("yes"));
    }
}
