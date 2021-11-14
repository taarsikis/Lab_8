package Facebook;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    private FacebookUser facebookUser;
    private MyFacebookUser myFacebookUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("lol@gmail.com", "London", new Date());
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(facebookUser.getCountry(), myFacebookUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActive() {
        assertEquals(facebookUser.getActiveTime(), myFacebookUser.getLastActivity());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(facebookUser.getEmail(), myFacebookUser.getEmail());
    }
}