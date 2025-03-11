class Employee
{	
	int eNo;
	String eName;
	float eSalary;
	
	Employee(int eNo,String eName,int eSalary)
	{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public void printDetails(){
		System.out.println("Employee number :" + this.eNo);
		System.out.println("Employee name :" + this.eNo);
		System.out.println("Employee salary :" + this.eNo);
	}
}
public class Main
{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the employee number : ");
	int eNo = sc.nextline();
	
	System.out.println("Enter the employee's name: ");
	String eName = sc.NextInt();
	
	System.out.println("Enter the employee Salary : ");
	float eSalary = sc.NextFloat();
	
	 }
}
