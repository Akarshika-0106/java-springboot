package codingpractice.DesignPatterns.SingletonPattern.EagerInitialization;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
