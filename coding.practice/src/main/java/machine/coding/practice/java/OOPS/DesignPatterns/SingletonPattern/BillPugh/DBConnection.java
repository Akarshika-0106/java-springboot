package machine.coding.practice.java.OOPS.DesignPatterns.SingletonPattern.BillPugh;

public class DBConnection {

    private static class DBConnectionHelper{
        private static final DBConnection INSTANCE_OBJECT = new DBConnection();
    }

    public static DBConnection getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}
