package com.startjava.lesson23.animal;

public class Wolf {

    private String gender = "Male";
    private String nickname = "Wolfie";
    private float weight = 38.5f;
    private int age = 5;
    private String color = "Grey";

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("is walking");
    }

    public void seat() {
        System.out.println("is sitting");
    }

    public void run() {
        System.out.println("is running");
    }

    public void howl() {
        System.out.println("is howling");
    }

    public void hunt() {
        System.out.println("is hunting");
    }
}