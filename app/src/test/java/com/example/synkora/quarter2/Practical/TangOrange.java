package com.example.synkora.quarter2.Practical;
import java.util.Scanner;
public class TangOrange {

    // Skill levels for a student
    private String studentName;
    private int programmingSkill;   // 0 - 10
    private int designSkill;        // 0 - 10
    private int communicationSkill; // 0 - 10

    public TangOrange(String studentName) {
        this.studentName = studentName;
        this.programmingSkill = 0;
        this.designSkill = 0;
        this.communicationSkill = 0;
    }

    // Update skill levels
    public void updateProgrammingSkill(int level) {
        programmingSkill = validate(level);
    }

    public void updateDesignSkill(int level) {
        designSkill = validate(level);
    }

    public void updateCommunicationSkill(int level) {
        communicationSkill = validate(level);
    }

    // Keep skill level between 0 and 10
    private int validate(int level) {
        if (level < 0) return 0;
        if (level > 10) return 10;
        return level;
    }

    // Display current skill profile
    public void displayProfile() {
        System.out.println("\n--- Skill Profile: " + studentName + " ---");
        System.out.println("Programming   : " + programmingSkill + "/10");
        System.out.println("Design        : " + designSkill + "/10");
        System.out.println("Communication : " + communicationSkill + "/10");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        TangOrange student = new TangOrange(name);

        System.out.print("Enter programming skill (0-10): ");
        student.updateProgrammingSkill(sc.nextInt());

        System.out.print("Enter design skill (0-10): ");
        student.updateDesignSkill(sc.nextInt());

        System.out.print("Enter communication skill (0-10): ");
        student.updateCommunicationSkill(sc.nextInt());

        student.displayProfile();

        sc.close();
    }
}
