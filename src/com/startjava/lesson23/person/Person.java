package com.startjava.lesson23.person;

public class Person {

    String gender = "Male";
    String name = "Aleksei";
    float height = 1.83f;
    float weight = 78.7f;
    int age = 38;

    void walk() {
        System.out.println("walking");
    }

    void seat() {
        System.out.println("sitting");
    }

    void run() {
        System.out.println("running");
    }

    String talk() {
        return "talking";
    }

    void studyJava() {
        System.out.println("studying Java");
    }
}