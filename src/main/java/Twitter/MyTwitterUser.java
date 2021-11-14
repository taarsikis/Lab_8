package Twitter;

import Facebook.User;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class MyTwitterUser implements User {
    private TwitterUser user;

    @Override
    public String getEmail(){
        return user.getUserMail();
    }

    @Override
    public String getCountry(){
        return user.getCountry();
    }

    @Override
    public Date getLastActivity(){
        return user.getLastActiveTime();
    }

}
