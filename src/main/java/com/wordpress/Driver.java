package com.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    static {
        System.setProperty("webdriver.chrome.driver","D:\\Tuning\\Selenium\\chromedriver.exe");
    }

    public static WebDriver instance;

    public static void Inittialize() {
        instance = new ChromeDriver();
        instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
