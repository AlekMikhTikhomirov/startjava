public class Cycle {
    public static void main(String[] args) {
        for(byte i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int counter = 6;
        while(counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }

        int sumOdd = 0;
        counter = 10;
        do {
            if(counter % 2 > 0) {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 20);
        System.out.println(sumOdd);
    }
}