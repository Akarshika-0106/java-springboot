package codingpractice.DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception{
        if(client.equals("Admin")){
            employeeDao.create(client, employeeDo);
            return;
        }
        throw new Exception("Access denied");

    }

    @Override
    public void delete(String client, int employeeId) throws Exception{
        if(client.equals("Admin")){
            employeeDao.delete(client, employeeId);
            return;
        }
        throw  new Exception("Access denied");


    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception{
        if (client.equals("Admin") || client.equals("user")){
            return employeeDao.get(client, employeeId);
        }
        throw new Exception("Access denied");
    }
}
