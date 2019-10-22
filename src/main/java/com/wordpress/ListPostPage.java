package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListPostPage {
    public static void goTo(PostType page) {
        switch (page) {
            case Page:
                NewPostPage.LeftNavigation.Pages.AllPages.select();
                break;
        }
    }

    public static void SelectPost(String title) {
        WebElement postLink = Driver.instance.findElement(By.linkText(title));
        postLink.click();
    }
}
