package com.selenium;

public class PathPages {
    static String url = "https://www.pluralsight.com/browse/software-development/java";
    static String title = "Learn Java - Tutorials & Online Courses | Pluralsight";
    public static void goTo(){
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
