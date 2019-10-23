package com.wordpress.selenium;

import com.wordpress.config.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Driver {
    static {
        System.setProperty("webdriver.chrome.driver","D:\\Tuning\\Selenium\\chromedriver.exe");
    }

    public static RemoteWebDriver instance;
    private static List<DriverFactory> webDriverThreadPool = Collections.synchronizedList(new ArrayList<DriverFactory>());
    private static ThreadLocal<DriverFactory> driverFactoryThread;
    public static void Inittialize() {
        instance = new ChromeDriver();
        instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driverFactoryThread = ThreadLocal.withInitial(() -> {
//            DriverFactory driverFactory = new DriverFactory();
//            webDriverThreadPool.add(driverFactory);
//            return driverFactory;
//        });
//        instance = driverFactoryThread.get().getDriver();
    }
}
