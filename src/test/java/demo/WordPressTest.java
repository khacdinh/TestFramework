package demo;

import com.wordpress.DashBoardPage;
import com.wordpress.Driver;
import com.wordpress.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
