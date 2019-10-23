package com.wordpress.Pages;

import com.wordpress.enums.PostType;
import com.wordpress.navigation.LeftNavigation;
import com.wordpress.selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ListPostPage {
    private static Integer lastCount;

    public static void goTo(PostType page) {
        switch (page) {
            case Page:
                LeftNavigation.Pages.AllPages.select();
                break;
            case Posts:
                LeftNavigation.Posts.allPosts.select();
        }
    }

    public static void SelectPost(String title) {
        WebElement postLink = Driver.instance.findElement(By.linkText(title));
        postLink.click();
    }

    public static void storeCount() {
        lastCount = getPostCount();
    }

    public static int getPreviousPostCount() {
        return lastCount;
    }


    private static Integer getPostCount() {
        String context = Driver.instance.findElement(By.className("displaying-num")).getText();
        return Integer.parseInt(context.split(" ")[0]);
    }

    public static int getCurrentPostPage() {
        return getPostCount();
    }

    public static boolean doesPostExistWithTitle(String title) {
        return Driver.instance.findElements(By.linkText(title)).size() > 0;
    }

    /**
     * Delete post
     *
     * @param title
     */
    public static void trashPost(String title) {
        List<WebElement> rows = Driver.instance.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> links = row.findElements(By.linkText(title));
            for (WebElement link : links) {
                Actions action= new Actions(Driver.instance);
                action.moveToElement(link);
                action.perform();
                row.findElement(By.className("submitdelete")).click();
                return;
            }
        }
    }

    public static void searchForPost(String searchString) {
        WebElement searchBox =Driver.instance.findElement(By.id("post-search-input"));
        searchBox.sendKeys(searchString);

        WebElement searchSubmit=Driver.instance.findElement(By.id("search-submit"));
        searchSubmit.click();
    }
}
