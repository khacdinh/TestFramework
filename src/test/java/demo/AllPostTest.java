package demo;

import com.wordpress.Pages.ListPostPage;
import com.wordpress.Pages.NewPostPage;
import com.wordpress.enums.PostType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllPostTest extends WordPressTest{
    //Added posts show up in all posts
    //Can trash a post
    // Can sear posts

    @Test
    public void add_post_show_up() {
        //Go to posts, get post count, store
        ListPostPage.goTo(PostType.Posts);
        ListPostPage.storeCount();

        // Add a new post
        NewPostPage.goTo();
        NewPostPage.createPost("Added posts show up,title").withBody("Added posts show up,body").publish();
        // Go to post again, get post count
        ListPostPage.goTo(PostType.Posts);

        Assert.assertEquals(ListPostPage.getPreviousPostCount() + 1, ListPostPage.getCurrentPostPage());
        //Check for added post
        Assert.assertTrue(ListPostPage.doesPostExistWithTitle("Added posts show up,title"));
        //Trash post (clean up)
        ListPostPage.trashPost("Added posts show up,title");
        Assert.assertEquals(ListPostPage.getCurrentPostPage(), ListPostPage.getPreviousPostCount());

    }

    @Test
    public void can_search_posts() {
        //Create a new post
        NewPostPage.goTo();
        NewPostPage.createPost("Searching posts,title").withBody("Searching posts ,body").publish();
        //Go to a list post
        ListPostPage.goTo(PostType.Posts);

        //Search for post
        ListPostPage.searchForPost("Searching posts,title");

        //Check that post show up in result
        Assert.assertTrue(ListPostPage.doesPostExistWithTitle("Searching posts,title"));

        //Clean up
        ListPostPage.trashPost("Searching posts,title");


    }
}
