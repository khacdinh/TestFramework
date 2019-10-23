package com.wordpress.Pages;

import com.wordpress.selenium.Driver;

public class LoginPage {
    private static final String URL = "https://khacdinh09t4.wordpress.com/wp-admin/index.php";

    public static void goTo() {
        Driver.instance.get(URL);
    }

    public static LoginCommand withEmail(String email) {
        return new LoginCommand(email);
    }

    public static void login(){
        LoginPage.goTo();
        LoginPage.withEmail("khacdinh09t4@gmail.com").withPassword("Lovefriend1@").Login();
    }
}
