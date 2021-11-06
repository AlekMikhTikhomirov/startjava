public class Cycle {
    public static void main(String[] args) {
        for(byte number = 0;number < 21;number++) {
            System.out.println(number);
        }

        int numbers = 6;
        while(Math.abs(numbers) <= 6) {
            System.out.println(numbers);
            numbers = numbers - 2;
        }

        int result = 0;
        int number1020 = 10;
        do {
            if(number1020 % 2 > 0) {
                result = result + number1020;
            } else {
                result = result;
            }
            number1020++;
        } while(number1020 <= 20);
        System.out.println(result);
    }
}