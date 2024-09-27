import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name,int id,int hoursWorked,int hourlyRate){
        super(name,id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked*hoursWorked;
    }
}
class PayRoll{
    private ArrayList<Employee> employeeList;
    public PayRoll(){
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for(Employee employee: employeeList){ 
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }
} 
public class Main{
    public static void main(String[] args) {
        PayRoll obj=new PayRoll();
        FullTimeEmployee obj1=new FullTimeEmployee("Swarnava",1,70000);
        PartTimeEmployee obj2=new PartTimeEmployee("Sonali", 2, 30, 200);

        obj.addEmployee(obj1);
        obj.addEmployee(obj2);
        System.out.println("Initial Employee details : ");
        obj.displayEmployees();
        System.out.println("Remove an Employee ");
        obj.removeEmployee(1);
        System.out.println("Remaining Employees: ");
        obj.displayEmployees();
    }
}