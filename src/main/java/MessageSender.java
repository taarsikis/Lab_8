import Facebook.User;

import java.util.Date;
import java.util.Objects;

public class MessageSender {

    public String send(String text, User user, String country){
        Date curr_date = new Date(1);
        if (user.getLastActivity().before(curr_date) && Objects.equals(user.getCountry(),country)){
            return "message was sent";
        }else{
            return "message wasn`t sent";
        }
    }
}
