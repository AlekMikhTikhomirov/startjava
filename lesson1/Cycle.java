public class Cycle {
    public static void main(String[] args) {
        for(byte i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int counter = 6;
        while(counter <= 6 & counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }

        int sumOdd = 0;
        int numbers = 10;
        do {
            if(numbers % 2 > 0) {
                sumOdd = sumOdd + numbers;
            }
            numbers++;
        } while(numbers <= 20);
        System.out.println(sumOdd);
    }
}