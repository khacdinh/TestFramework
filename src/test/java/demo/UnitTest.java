package demo;

import com.selenium.Browser;
import com.selenium.Pages;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class UnitTest {

    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToJavaPathPage(){
        Pages.pathPages().goTo();
        Assert.assertTrue(Pages.pathPages().isAt());
    }

    @AfterTest
    public void cleanUp(){
        Browser.close();
    }
}
