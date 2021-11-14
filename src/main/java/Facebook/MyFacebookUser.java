package Facebook;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class MyFacebookUser implements User{
    private FacebookUser user;

    @Override
    public String getEmail(){
        return user.getEmail();
    }

    @Override
    public String getCountry(){
        return user.getCountry();
    }

    @Override
    public Date getLastActivity(){
        return user.getActiveTime();
    }
}
