package DesignPatterns.ProxyDesignPattern;

public class Main {
    //This pattern is used in design questions related to access restriction,
    // caching, preprocessing or postprocessing.
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        try {
            employeeDao.create("Admin", new EmployeeDo());
            System.out.println("Operation successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
