package com.wordpress;

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

    public static class LeftNavigation {
        static class Posts {
            static class AddNews {
                static void selects() {
                    MenuSelector.select("menu-posts","Add New");
                }
            }
        }
        static class Pages{
            static class AllPages {
                static void select(){
                    MenuSelector.select("menu-pages","All Pages");
                }
            }
        }
    }

    public static class MenuSelector {
        public static void select(String menuId,String linkText) {
            Driver.instance.findElement(By.id(menuId)).click();
            Driver.instance.findElement(By.linkText(linkText)).click();

        }
    }

}
