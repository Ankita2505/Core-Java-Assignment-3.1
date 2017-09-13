package Employee;
/*
 * program in java to differentiate between instance variables and class variables. 
 * And also show the scope of each.
 */
public class Employee 
{	
	   public String name;// this instance variable is visible for any child class.	   
	   private double salary1;// salary  variable is visible in Employee class only.
	   private  static String name1;// Name1 variable is private static variable or Class Variable
	   private static double salary;// salary  variable is a private static variable or Class Variable
	   public Employee (String empName) 
	   {
	      name = empName; // The name variable is assigned in the constructor
	   }	   
	   public void setSalary(double empSal) 
	   {
	      salary1 = empSal;// The salary variable is assigned a value.
	   }	
	   public void printEmp() // This method prints the employee details.
	   {
	      System.out.println("Employee name  : " + name );
	      System.out.println("Employee salary :" + salary1);
	   }	   	
	   public static void main(String[] args)  // Start of Main Class
	   {	
		   // TODO Auto-generated method stub
		  System.out.println("Result of Instance Variable");
		  Employee emp1 = new Employee("Ankita");
	      emp1.setSalary(1000);
	      emp1.printEmp();  
	      System.out.println("Result of Class Variable");	    
	      name1="Ankita";
          salary = 1000;
          System.out.println("Name:" + name1);
	      System.out.println("salary:" + salary);
	   }  // Close of Main Class
}


