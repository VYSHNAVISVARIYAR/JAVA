import java.util.Scanner;

class Employee {
	
	int eNo;
	String eName;
	float eSalary;
	
	Employee(int eNo,String eName,float eSalary)
	{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public void printDetails(){
		System.out.println("Employee details");
		System.out.println("-----------------");
		System.out.println("Employee number :" + this.eNo);
		System.out.println("Employee name :" + this.eName);
		System.out.println("Employee salary :" + this.eSalary);
	}
}
public class Main
{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the employee number : ");
	int eNo = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter the employee's name: ");
	String eName = sc.nextLine();
	
	System.out.println("Enter the employee Salary : ");
	float eSalary = sc.nextFloat();

	Employee employee = new Employee(eNo, eName, eSalary);
	
		employee.printDetails();
	 }
}

