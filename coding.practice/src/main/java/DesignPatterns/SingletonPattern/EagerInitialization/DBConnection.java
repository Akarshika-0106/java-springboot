package DesignPatterns.SingletonPattern.EagerInitialization;

public class DBConnection {

    private static DBConnection dbConnection = new DBConnection();

    private DBConnection(){
    }

    public static DBConnection getInstance(){
        return dbConnection;
    }
}
