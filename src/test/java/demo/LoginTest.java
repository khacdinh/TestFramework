package demo;

import com.wordpress.DashBoardPage;
import com.wordpress.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void Admin_User_Can_Login() {
        LoginPage.goTo();
        LoginPage.withEmail("khacdinh09t4@gmail.com").withPassword("Lovefriend1@").Login();
        Assert.assertTrue(DashBoardPage.isAt());
    }
}
