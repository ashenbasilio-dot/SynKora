package com.example.synkora.quarter2;
import org.junit.Test;

public class TampoyTest {
    @Test
    public void printMyProfile() {
        String myName = "Kayzee";
        String myPet = "Luna";
        String favFood = "Shrimps";
        int Age = 16;

        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + "! and I am " + Age + " years old.");
        System.out.println("My favorite food is " + favFood + " and I love my energetic pet named " + myPet);
    }
}
