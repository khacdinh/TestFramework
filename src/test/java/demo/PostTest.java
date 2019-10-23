package demo;

import com.wordpress.Pages.NewPostPage;
import com.wordpress.Pages.PostPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostTest extends WordPressTest{
    @Test
    public void Can_Create_A_Basic_Post() {
        NewPostPage.goTo();
        NewPostPage.createPost("This is a title").withBody("Hi, This is a body").publish();
        NewPostPage.goToNewPost();
        Assert.assertEquals(PostPage.getTitle(),"THIS IS A TITLE");
    }
}
