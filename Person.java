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
	String Department,int Teacherid)
	{
		super(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary);
		this.Subject = Subject;
		this.Department = Department;
		this.Teacherid = Teacherid;
	}
	
	void displayTeacher()
	{
		super.displayEmployee();
		System.out.println("Subject :"+Subject);
		System.out.println("Department :"+Department);
		System.out.println("Teacherid :"+Teacherid);
		System.out.println();
	}
}

public class Main2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the teacher's list");
		Teacher teachers[] = new Teacher[3];
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter the name of the teacher : ");
			String te = sc.nextLine();
			System.out.print("Gender : ");
			String ge = sc.nextLine();
			System.out.print("Address : ");
			String ad = sc.nextLine();
			System.out.print("Age :");
			int ag = sc.nextInt();
			System.out.print("Employee id:");
			int em = sc.nextInt();
			System.out.print("Company name : ");
			String cn = sc.nextLine();
			sc.nextLine();
			System.out.print("Qualification  : ");
			String qu = sc.nextLine();
			System.out.print("Salary : ");
			float sa = sc.nextFloat();
			System.out.print("Subject : ");
			sc.nextLine();
			String su = sc.nextLine();
			System.out.print("Department : ");
			String de = sc.nextLine();
			System.out.print("Teacher id : ");
			int ti = sc.nextInt();
			sc.nextLine();

			
			teachers[i] = new Teacher(te,ge,ad,ag,em,cn,qu,sa,su,de,ti);
			
			System.out.println("---List of teachers---");
			for(i=0;i<3;i++)
			{
			if(teachers[i]== null){
				System.out.println("No details entered!");
				}
			else{
				teachers[i].displayTeacher();
			}
			}
		}
	
	}
	
}



