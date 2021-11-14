import Authorization.MyAthorization;
import Authorization.Авторизація;
import DataBase.MyDataBase;
import DataBase.БазаДаних;

public class Main {
    public static void main(String[] args) {
        MyDataBase db = new MyDataBase();
        MyAthorization авторизація = new MyAthorization(new Авторизація());
        if (авторизація.authorizate(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
