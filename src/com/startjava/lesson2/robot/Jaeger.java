package com.startjava.lesson2.robot.Jaeger;

public class Jaeger {
    private String model Name;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}