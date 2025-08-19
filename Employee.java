package oops;

public class Employee {
	 String name;
     int id;
     double salary;
    
    public Employee(String n, int id, double sal)
    {
    	this.name=n;
    	this.id=id;
    	this.salary=sal;
    }
    
    public void displayDetails()
    {
    	System.out.println("Name: "+name);
    	System.out.println("Id: "+id);
    	System.out.println("Salary:"+salary);
    	System.out.println("____________");    }
    
    public void increaseSalary(double percentage)
    {

    	salary+=(salary*percentage)/100.0d;
    	System.out.println("New Salary" + percentage + "%increase:" + salary);

}
}
