package machine.coding.practice.java.OOPS.DesignPatterns.SingletonPattern.DoubleLocking;

public class DBConnection {
    private static volatile DBConnection dbConnection;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(dbConnection == null){
            synchronized (DBConnection.class){
                if(dbConnection == null){
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
