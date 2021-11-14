package Authorization;

import DataBase.MyDataBase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyAthorization {
    private Авторизація authorization;

    public boolean authorizate( MyDataBase db){
        return authorization.авторизуватися(db);
    }
}
