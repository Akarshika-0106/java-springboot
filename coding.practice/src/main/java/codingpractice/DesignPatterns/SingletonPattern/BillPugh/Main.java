package codingpractice.DesignPatterns.SingletonPattern.BillPugh;

public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
