package machine.coding.practice.java.OOPS.DesignPatterns.SingletonPattern.SynchronizedMethod;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
