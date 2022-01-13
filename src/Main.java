package Lesson0_PracticeGUI.Login_System;

public class Main {
    public static void main(String[] args) {
        IdAndPasswords idandpasswords = new IdAndPasswords();


        LoginPage loginPage = new LoginPage(idandpasswords.getLoginInfo());
    }
}
