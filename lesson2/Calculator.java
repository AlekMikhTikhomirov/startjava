public class Calculator {

    private int firstNumber = 0;
    private int secondNumber = 0;
    private char operator = '+';
    public int operationResult = 0;
    public int chooseYesNo = 1;

    public void setChooseYesNo(int chooseYesNo) {
            this.chooseYesNo = chooseYesNo;
    }

    public int getChooseYesNo() {
        return chooseYesNo;
    }

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

    public void summarize() {
        System.out.println(firstNumber + secondNumber);
    }

    public void subtract() {
        System.out.println(firstNumber - secondNumber);
    }

    public void multiply() {
        System.out.println(firstNumber * secondNumber);
    }

    public void divide() {
        System.out.println(firstNumber / secondNumber);
    }

    public void findReminderOfDivision() {
        System.out.println(firstNumber % secondNumber);
    }

    public void raiseToDegree() {
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
        System.out.println(operationResult);
    }
}