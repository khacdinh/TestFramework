package demo;

import com.wordpress.ListPostPage;
import com.wordpress.NewPostPage;
import com.wordpress.PostType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends WordPressTest{
    @Test
    public void Can_Go_To_Edit_Page() {
        ListPostPage.goTo(PostType.Page);
        ListPostPage.SelectPost("Sample page");
        Assert.assertTrue(NewPostPage.isInEditMode());
    }
}
