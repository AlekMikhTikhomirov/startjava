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
                System.out.println("Результат = " + operationResult);
                break;
            case '-':
                operationResult = getFirstNumber() - getSecondNumber();
                System.out.println("Результат = " + operationResult);
                break;
            case '*':
                operationResult = getFirstNumber() * getSecondNumber();
                System.out.println("Результат = " + operationResult);
                break;
            case '/':
                operationResult = getFirstNumber() / getSecondNumber();
                System.out.println("Результат = " + operationResult);
                break;
            case '%':
                operationResult = getFirstNumber() % getSecondNumber();
                System.out.println("Результат = " + operationResult);
                break;
            case '^':
                if(secondNumber == 0) {
                    operationResult = 1;
                } else if(secondNumber == 1) {
                    operationResult = firstNumber;
                } else if(secondNumber > 1) {
                    operationResult = firstNumber;
                    for(int i = secondNumber; i > 1; i--) {
                    operationResult *= firstNumber;
                    }
                }
                System.out.println("Результат = " + operationResult);
        }
    }
}