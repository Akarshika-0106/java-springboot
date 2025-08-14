package machine.coding.practice.java.OOPS.DesignPatterns.SingletonPattern.SynchronizedMethod;

public class DBConnection {

    private static DBConnection dbConnection;

    private DBConnection(){

    }

    public synchronized static DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
