package patterns.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();



    }
}
