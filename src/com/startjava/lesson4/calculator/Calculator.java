package com.startjava.lesson4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operator;
    public int operationResult;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        switch(getOperator()) {
            case '+':
                operationResult = getFirstNumber() + getSecondNumber();
                break;
            case '-':
                operationResult = getFirstNumber() - getSecondNumber();
                break;
            case '*':
                operationResult = getFirstNumber() * getSecondNumber();
                break;
            case '/':
                operationResult = getFirstNumber() / getSecondNumber();
                break;
            case '%':
                operationResult = getFirstNumber() % getSecondNumber();
                break;
            case '^':
                operationResult = (int) Math.pow(getFirstNumber(), getSecondNumber());
        }
                System.out.println("Результат = " + operationResult);
        }
    }
