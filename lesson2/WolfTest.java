public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println(wolfOne.color);
        System.out.println(wolfOne.nickname);
        wolfOne.walk();
        wolfOne.hunt();
        wolfOne.seat();
        wolfOne.howl();
        wolfOne.run();
    }
}