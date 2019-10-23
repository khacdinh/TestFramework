package com.wordpress.Pages;

import com.wordpress.navigation.LeftNavigation;
import com.wordpress.selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewPostPage {
    public static void goTo() {
        LeftNavigation.Posts.AddNews.selects();

    }

    public static NewPostPageCommand createPost(String title) {
        return new NewPostPageCommand(title);
    }


    public static void goToNewPost() {
        WebElement message = Driver.instance.findElement(By.id("sample-permalink"));
        WebElement newPostLLink = message.findElements(By.tagName("a")).get(0);
        newPostLLink.click();
    }

    public static boolean isInEditMode() {
        return Driver.instance.findElement(By.id("edit-slug-buttons")) != null;
    }



}
