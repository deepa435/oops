package oops;

public class MainClass {

	public static void main(String[] args)
	{
		Employee e1=new Employee("geetha", 101,10000.0d);
		Employee e2=new Employee("seetha", 102,20000.0d);
	
		System.out.println("Initial Employee Details:");
		e1.displayDetails();
		e2.displayDetails();
		
		e1.increaseSalary(10.0d);
		e2.increaseSalary(15.0d);
		
		System.out.println("Updated Employee Details:");
		e1.displayDetails();
		e2.displayDetails();

	}

}
