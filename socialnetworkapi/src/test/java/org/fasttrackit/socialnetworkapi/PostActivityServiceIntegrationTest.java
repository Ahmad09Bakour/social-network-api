package org.fasttrackit.socialnetworkapi;

import org.fasttrackit.socialnetworkapi.domain.PostActivity;
import org.fasttrackit.socialnetworkapi.service.PostActivityService;
import org.fasttrackit.socialnetworkapi.transfer.postActivity.CreatePostActivityRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostActivityServiceIntegrationTest {

    private PostActivityService postActivityService;

    public PostActivity createPostActivityMethod(){
        CreatePostActivityRequest request = new CreatePostActivityRequest();
        request.setTitle("Walking on the moon light..");
        request.setDescription("I'm thinking of you\n" +
                "Listening to the rain\n" +
                "drops I'm thinking of you\n" +
                "Ilaman kanniloode I'm thinking of you\n" +
                "Ila neer kanaviloode I'm thinking of you\n" +
                "Hey saloma oh saloma oh saloma\n" +
                "Oh saloma\n" +
                "Walking in the moon light\n" +
                "I'm thinking of you\n" +
                "Listening to the rain\n" +
                "drops I'm thinking of you\n" +
                "Ilaman kanniloode I'm thinking of you\n" +
                "Ila neer kanaviloode I'm thinking of you\n" +
                "Hey saloma oh saloma oh saloma\n" +
                "Oh saloma");
        PostActivity postActivity = postActivityService.createPostActivity(request);

        assertThat("No Post returned.", postActivity, notNullValue());
        assertThat("Post doesn't have an auto-generated id", postActivity.getId(), greaterThan(0L));
        assertThat(postActivity.getTitle(), is(request.getTitle()));
        assertThat(postActivity.getDescription(), is(request.getDescription()));

        return postActivity;

    }

    @Test
    public void testCreatePostActivity_whenValidRequest_thenReturnStoredPost(){

        createPostActivityMethod();
    }
}
