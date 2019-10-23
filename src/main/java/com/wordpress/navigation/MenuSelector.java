package com.wordpress.navigation;

import com.wordpress.selenium.Driver;
import org.openqa.selenium.By;

public  class MenuSelector {
    public static void select(String menuId,String linkText) {
        Driver.instance.findElement(By.id(menuId)).click();
        Driver.instance.findElement(By.linkText(linkText)).click();

    }
}
