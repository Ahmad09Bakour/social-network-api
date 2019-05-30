package org.fasttrackit.socialnetworkapi;

import org.fasttrackit.socialnetworkapi.domain.User;
import org.fasttrackit.socialnetworkapi.service.UserService;
import org.fasttrackit.socialnetworkapi.transfer.CreateUserRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    public User createUser(){
        CreateUserRequest request = new CreateUserRequest();
        request.setName("George");

        User user = userService.createUser(request);

        assertThat("No User returned..", user, notNullValue());
        assertThat("User doesn't have an auto-generated id", user.getId(), greaterThan(0L));
        assertThat(user.getName(), is(request.getName()));

        return user;
    }
    @Test
    public void testCreateUser_whenValidRequest_thenReturnStoredUser(){
        createUser();

    }
}
