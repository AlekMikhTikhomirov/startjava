public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        String gender = "Female";
        String nickname = "Yara";
        float weight = 0.6f;
        int age = 4;
        String color = "Black";
        System.out.println("Пол:" + wolfOne.gender);
        System.out.println("Позывной:" + wolfOne.nickname);
        System.out.println("Вес:" + wolfOne.weight);
        System.out.println("Возраст:" + wolfOne.age);
        System.out.println("Цвет:" + wolfOne.color);
        wolfOne.walk();
        wolfOne.hunt();
        wolfOne.seat();
        wolfOne.howl();
        wolfOne.run();
    }
}