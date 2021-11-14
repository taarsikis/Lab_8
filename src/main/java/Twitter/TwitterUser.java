package Twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String UserMail;
    private String Country;
    private Date LastActiveTime;
}
