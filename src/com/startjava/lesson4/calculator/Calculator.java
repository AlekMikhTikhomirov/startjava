package com.startjava.lesson4.calculator;

public class Calculator {

    private String mathExpression;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void calculate() {
        String[] expressionParts = mathExpression.split(" ");
        int firstNumber = Integer.parseInt(expressionParts[0]);
        char operator = expressionParts[1].charAt(0);
        int secondNumber = Integer.parseInt(expressionParts[2]);
        int operationResult = 0;
        switch (operator) {
            case '+':
                operationResult = firstNumber + secondNumber;
                break;
            case '-':
                operationResult = firstNumber - secondNumber;
                break;
            case '*':
                operationResult = firstNumber * secondNumber;
                break;
            case '/':
                operationResult = firstNumber / secondNumber;
                break;
            case '%':
                operationResult = firstNumber % secondNumber;
                break;
            case '^':
                operationResult = (int) Math.pow(firstNumber, secondNumber);
        }
        System.out.println("Результат = " + operationResult);
    }
}


