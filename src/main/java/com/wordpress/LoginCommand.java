package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LoginCommand {
    private String email;
    private String password;

    public LoginCommand(String email) {
        this.email = email;
    }

    public LoginCommand withPassword(String password) {
        this.password = password;
        return this;
    }

    public void Login() {
        WebElement usernameOrEmail = Driver.instance.findElement(By.id("usernameOrEmail"));
        usernameOrEmail.sendKeys(this.email);
        Driver.instance.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button")).click();
        Driver.instance.findElement(By.id("password")).sendKeys(this.password);
        Driver.instance.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button")).click();
    }
}
