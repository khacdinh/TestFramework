package demo;

import com.wordpress.Pages.LoginPage;
import com.wordpress.selenium.Driver;
import org.testng.annotations.BeforeTest;

public class WordPressTest {

    @BeforeTest
    public void init() {
        Driver.Inittialize();
        LoginPage.login();
    }

  //  @AfterTest
    public void clean() {
        Driver.instance.close();
    }
}
