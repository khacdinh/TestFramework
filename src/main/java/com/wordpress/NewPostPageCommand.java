package com.wordpress;

import org.openqa.selenium.By;

public class NewPostPageCommand {
    private String title;
    private String body;

    public NewPostPageCommand(String title) {
        this.title = title;
    }

    public NewPostPageCommand withBody(String body) {
        this.body = body;
        return this;
    }

    public void publish() {
        Driver.instance.findElement(By.id("title")).sendKeys(title);
        Driver.instance.switchTo().frame("content_ifr");
        Driver.instance.switchTo().activeElement().sendKeys(body);
        Driver.instance.switchTo().defaultContent();

        Driver.instance.findElement(By.id("publish")).click();

    }
}