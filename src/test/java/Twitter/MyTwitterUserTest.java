package Twitter;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    private TwitterUser twitterUser;
    private MyTwitterUser adaptedTwitterUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("lol@gmail.com", "London", new Date());
        adaptedTwitterUser = new MyTwitterUser(twitterUser);
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), adaptedTwitterUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActive() {
        assertEquals(twitterUser.getLastActiveTime(), adaptedTwitterUser.getLastActivity());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(twitterUser.getUserMail(), adaptedTwitterUser.getEmail());
    }
}