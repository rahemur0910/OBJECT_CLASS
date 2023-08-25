/*
	Define a class ‘Salary’ described as below:
	Data Members:
	Name, Address, Phone, Subject Specialisation, Monthly Salary, Income Tax.
	Member methods:
	i. To accept the details of a teacher including the monthly salary.
	ii. To display the details of the teacher.
	iii. To compute the annual Income Tax as 5% of the annual salary above Rs. 1,75,000/-.
	Write a main method to create object of the class and call the above member method.
*/
import java.io.*;
class Salary
{
	String Name,Subject,Address;
	double Phone,IT,MonthlySalary;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter Employee Name: ");
		Name = ad.readLine();
		System.out.print("Enter Employee Address: ");
		Address = ad.readLine();
		System.out.print("Enter Employee Subject Specialisation: ");
		Subject = ad.readLine();
		System.out.print("Enter Employee Phone Number:+91 ");
		Phone = Double.valueOf(ad.readLine());
		System.out.print("Enter Employee MonthlySalary: ");
		MonthlySalary = Double.valueOf(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		double AnnualSalary = MonthlySalary *12;
		if(AnnualSalary>175000)
		{
			IT = 0.05 * (AnnualSalary -175000);
		}
		else
		{
			IT = 0;
		}
		
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Address:"+Address);
		System.out.println("Employee Phone Number:+91 "+Phone);
		System.out.println("Employee Subject Specialisation:"+Subject);
		System.out.println("Employee Monthly Salary:"+MonthlySalary);
		System.out.println("Employee Income Tax:"+IT);
		System.out.println();
	}
}
 
class Demo
{
	public static void main(String[] args)
	{
		int NewEmployee = 0;
		try
		{
			System.out.print("Enter No of Employee: ");
			NewEmployee = Integer.parseInt(new Salary().ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		if(NewEmployee > 0)
		{
			Salary ob[] = new Salary[NewEmployee];
			for(int i=0;i<ob.length;i++)
			{
				ob[i] = new Salary();
				ob[i].getData();
			}
			for(int i=0;i<ob.length;i++)
			{
				ob[i].showData();
			}
		}
	}
}

