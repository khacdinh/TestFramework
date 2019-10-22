package com.selenium;

import org.testng.annotations.AfterTest;

public class HomePage {
    static String url = "https://www.pluralsight.com";
    static String title = "Unlimited Online Developer, IT and Cyber Security Training | Pluralsight";
    public static void goTo(){
        Browser.goTo(url);
    }
    public boolean isAt() {
        return Browser.title().equals(title);
    }


}
