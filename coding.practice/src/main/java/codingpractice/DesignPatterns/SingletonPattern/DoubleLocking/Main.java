package codingpractice.DesignPatterns.SingletonPattern.DoubleLocking;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
