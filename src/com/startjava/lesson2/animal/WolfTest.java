package com.startjava.lesson2.animal.WolfTest;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setGender("Female");
        System.out.println("Пол:" + wolfOne.getGender());

        wolfOne.setNickname("Yara");
        System.out.println("Позывной:" + wolfOne.getNickname());

        wolfOne.setWeight(32.5f);
        System.out.println("Вес:" + wolfOne.getWeight());

        wolfOne.setAge(4);
        System.out.println("Возраст:" + wolfOne.getAge());

        wolfOne.setColor("Black");
        System.out.println("Цвет:" + wolfOne.getColor());

        wolfOne.walk();
        wolfOne.hunt();
        wolfOne.seat();
        wolfOne.howl();
        wolfOne.run();
    }
}