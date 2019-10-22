package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashBoardPage {
    private final static String TITLE = "Dashboard ‹ khacdinh09t4 — WordPress";

    public static boolean isAt() {
        //Refactor
        List<WebElement> h2s = Driver.instance.findElements(By.tagName("h1"));
        if (h2s.size()>0) {
            return h2s.get(0).getText().equals("Dashboard");
        }
        return false;
    }

}
