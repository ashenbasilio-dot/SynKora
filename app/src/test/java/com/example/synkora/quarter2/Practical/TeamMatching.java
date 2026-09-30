package com.example.synkora.quarter2.Practical;

public class TeamMatching {
    public static void main(String[] args) {
        // Variables
        int teamID = 101;
        String teamName = "Alpha Warriors";
        int playerID = 1001;
        String playerName = "Shen";
        String skillLevel = "Intermediate";
        int teamMembers = 5;
        boolean isMatched = true;
        String matchDate = "2027-07-19";
        String gameMode = "Squad";
        String status = "Matched";

        // Display Information
        System.out.println("=== Team Matching System ===");
        System.out.println("Team ID: " + teamID);
        System.out.println("Team Name: " + teamName);
        System.out.println("Player ID: " + playerID);
        System.out.println("Player Name: " + playerName);
        System.out.println("Skill Level: " + skillLevel);
        System.out.println("Team Members: " + teamMembers);
        System.out.println("Matched: " + isMatched);
        System.out.println("Match Date: " + matchDate);
        System.out.println("Game Mode: " + gameMode);
        System.out.println("Status: " + status);
    }
}

