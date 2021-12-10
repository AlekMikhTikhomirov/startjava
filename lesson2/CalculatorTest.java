import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculatorOne = new Calculator();
        Scanner console = new Scanner(System.in);
        do {
        System.out.println("Введите первое число и нажите Enter");
        calculatorOne.setFirstNumber(console.nextInt());
        System.out.println("Введите один из символов математической операции (+,-,*,/,^,%) и нажмите Enter");
        calculatorOne.setOperator(console.next().charAt(0));
        System.out.println("Введите второе число и нажмите Enter");
        calculatorOne.setSecondNumber(console.nextInt());

        switch(calculatorOne.getOperator()) {
            case '+': calculatorOne.summarize();
            break;
            case '-': calculatorOne.subtract();
            break;
            case '*': calculatorOne.multiply();
            break;
            case '/': calculatorOne.divide();
            break;
            case '%': calculatorOne.findReminderOfDivision();
            break;
            case '^': calculatorOne.raiseToDegree();
            break;
            }

        System.out.println("Хотите продолжить вычисления? [yes(1) / no(0)]");
        do {
            calculatorOne.setChooseYesNo(console.nextInt());
            if(calculatorOne.getChooseYesNo() == 1) {
                System.out.println("Продолжим!");
            } else if(calculatorOne.getChooseYesNo() == 0) {
                System.out.println("До свидания!");
            } else if(calculatorOne.getChooseYesNo() > 1) {
                System.out.println("Внимание!!! Некорректный ввод. Введите 1, чтобы продолжить вычисления или 2, чтобы закончить! [yes(1) / no(0)]");
            }
        } while(calculatorOne.getChooseYesNo() > 1);
        } while(calculatorOne.getChooseYesNo() == 1);
    }
}
