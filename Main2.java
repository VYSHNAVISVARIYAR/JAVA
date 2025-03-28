import java.util.Scanner;

class Person{
	String Name;
	String Gender;
	String Address;
	int Age;
	
	Person(String Name,String Gender,String Address,int Age)
	{
		this.Name = Name;
		this.Gender = Gender;
		this.Address = Address;
		this.Age = Age;
	}
	
	void displayPerson(){
		System.out.println("Name :"+Name);
		System.out.println("Gender :"+Gender);
		System.out.println("Address :"+Address);
		System.out.println("Age :"+Age);
	}
}

class Employee extends Person{
	int Empid;
	String Company_name;
	String Qualification;
	float Salary;
	
	Employee(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,float Salary)
	{
		super(Name,Gender,Address,Age);
		this.Empid = Empid;
		this.Company_name = Company_name;
		this.Qualification = Qualification;
		this.Salary = Salary;
	}
	
	void displayEmployee()
	{
		super.displayPerson();
		System.out.println("Employee ID :"+Empid);
		System.out.println("Company name :"+Company_name);
		System.out.println("Qualification :"+Qualification);
		System.out.println("Salary :"+Salary);
	}
}

class Teacher extends Employee{
	String Subject;
	String Department;
	int Teacherid;
	
	Teacher(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,float Salary,String Subject,
	String Department,int Teacherid);
	{
		super(Name,Gender,Address,Age,Empid,Company_name,Qualification);
		this.Subject = Subject;
		this.Department = Department;
		this.Teacherid = TeacherId;
	}
	
	void displayTeacher()
	{
		super.displayEmployee();
		System.out.println("Subject"+Subject);
		System.out.println("Department"+Department);
		System.out.println("Teacherid"+TeacherId);
	}
}

public class Main2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the teacher's list");
		Person emp[] = new Person[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name of the teacher : ");
			String teacher = sc.nextLine();
			System.out.println("Gender : ");
			String gender = sc.nextLine();
			System.out.println("Address : ");
			String address = sc.nextLine();
			System.out.println("Age :");
			int age = sc.nextInt();
			System.out.println("Employee id:");
			int emp_id = sc.nextInt();
			System.out.println("Company name : ");
			String cname = sc.nextLine();
			System.out.println("Qualification  : ");
			String qual = sc.nextLine();
			System.out.println("Salary : ");
			float sal = sc.nextFloat();
			System.out.println("Subject : ");
			String sub = sc.nextLine();
			System.out.println("Department : ");
			String dep = sc.nextLine();
			System.out.println("Teacher id : ");
			int tid = sc.nextInt();
		}
	
	}
	
}




