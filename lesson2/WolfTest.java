public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        String gender = wolfOne.gender;
        String nickname = wolfOne.nickname;
        float weight = wolfOne.weight;
        int age = wolfOne.age;
        String color = wolfOne.color;
        System.out.println("Пол:" + gender);
        System.out.println("Позывной:"+ nickname);
        System.out.println("Вес:"+ weight);
        System.out.println("Возраст:"+ age);
        System.out.println("Цвет:"+ color);
        wolfOne.walk();
        wolfOne.hunt();
        wolfOne.seat();
        wolfOne.howl();
        wolfOne.run();
    }
}