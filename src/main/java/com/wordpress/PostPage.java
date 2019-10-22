package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostPage {
    public static String title;

    public static String getTitle() {
        WebElement title = Driver.instance.findElement(By.className("entry-title"));
        if (title != null) {
            return title.getText();
        }
        return "";
    }
}
