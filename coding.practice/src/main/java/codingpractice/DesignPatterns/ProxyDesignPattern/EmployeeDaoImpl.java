package codingpractice.DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo employeeDo) {
        System.out.println("Creating EmployeeDo");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Deleting EmployeeDo");

    }

    @Override
    public EmployeeDo get(String client, int employeeId) {
        return new EmployeeDo();
    }
}
