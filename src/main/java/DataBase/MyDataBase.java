package DataBase;

public class MyDataBase extends БазаДаних{
    БазаДаних db;

    public String getUserData(){
        return db.отриматиДаніКористувача();
    }

    public String getUserStaticData(){
        return db.отриматиСтатистичніДані();
    }
}
