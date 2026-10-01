package com.example.synkora.quarter2.Practical;



class LoginValidation {

    String studentID;

    String password;

    boolean isValidLogin;

    String loginStatus;

}

class MainLoginValidation {

    public static void main(String[] args) {

        LoginValidation login = new LoginValidation();

        login.studentID = "2026001";
        login.password = "12345";

        if (login.studentID.equals("2026001") && login.password.equals("12345")) {
            login.isValidLogin = true;
            login.loginStatus = "Login successful!";
        } else {
            login.isValidLogin = false;
            login.loginStatus = "Invalid student ID or password.";
        }

        System.out.println(login.loginStatus);
    }
}