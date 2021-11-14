package Facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String Email;
    private String Country;
    private Date ActiveTime;
}
