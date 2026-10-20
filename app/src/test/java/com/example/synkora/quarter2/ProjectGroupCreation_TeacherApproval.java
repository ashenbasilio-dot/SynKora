package com.example.synkora.quarter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProjectGroupCreation_TeacherApproval {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter project group name: ");
        String groupName = scanner.nextLine();

        System.out.print("Enter teammate 1: ");
        String teammate1 = scanner.nextLine();

        System.out.print("Enter teammate 2: ");
        String teammate2 = scanner.nextLine();

        System.out.print("Enter teammate 3: ");
        String teammate3 = scanner.nextLine();

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timestamp = currentTime.format(formatter);

        String actionTypeEventName = "PROJECT GROUP CREATION";
        String status = "Created";

        System.out.println("\nProject group created successfully!");

        System.out.println("\n========== PROJECT GROUP ==========");
        System.out.println("Group Name: " + groupName);
        System.out.println("Teammate 1: " + teammate1);
        System.out.println("Teammate 2: " + teammate2);
        System.out.println("Teammate 3: " + teammate3);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("ActionType/EventName: " + actionTypeEventName);
        System.out.println("Status: " + status);
        System.out.println("===================================");

        System.out.print("\nTeacher approval (Approve/Reject): ");
        String teacherDecision = scanner.nextLine();

        String approvalStatus;

        if (teacherDecision.equalsIgnoreCase("Approve")) {

            approvalStatus = "Approved";

            System.out.println("\nProject group approved by the teacher!");

        } else if (teacherDecision.equalsIgnoreCase("Reject")) {

            approvalStatus = "Rejected";

            System.out.println("\nProject group rejected by the teacher.");

        } else {

            approvalStatus = "Invalid";

            System.out.println("\nInvalid teacher decision.");
        }

        System.out.println("\n========== TEACHER APPROVAL ==========");
        System.out.println("Group Name: " + groupName);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("ActionType/EventName: TEACHER APPROVAL");
        System.out.println("Status: " + approvalStatus);
        System.out.println("======================================");

        scanner.close();
    }
}