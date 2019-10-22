package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    static {
        System.setProperty("webdriver.chrome.driver","D:\\Tuning\\Selenium\\chromedriver.exe");

    }

    static WebDriver driver = new ChromeDriver();

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }
}
