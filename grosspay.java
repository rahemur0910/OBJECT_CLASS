/*  Write a class with name Employee and basic as its data member, to find and display the gross
	pay of an employee for the following allowances and deduction. Use meaningful variables.
	Basic pay
	Dearness Allowance = 25% of the Basic Pay
	House Rent Allowance = 15% of Basic Pay
	Provident Fund = 8.33% of Basic Pay
	Net Pay = Basic Pay + Dearness Allowance + House Rent Allowance
	Gross Pay = Net Pay − Provident Fund 
*/
import java.io.*;
class Employee
{
	int NewEmployee;
	String empname;
	double BasicPay,DA,HRA,PF,NetPay,GrossPay;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	
	public void getData()
	{
		try
		{
		System.out.print("Enter Employee Name: ");
		empname = ad.readLine();
		System.out.print("Enter Employee Basic Pay: ");
		BasicPay = Double.valueOf(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		DA = 25/100;
		HRA = 15/100;
		PF = 8.33/100;
		DA = DA * BasicPay;
		HRA = HRA * BasicPay;
		PF = PF * BasicPay;
		NetPay = BasicPay + DA + HRA;
		GrossPay = NetPay - PF;
		System.out.println(empname+"\t"+BasicPay+"\t"+GrossPay);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		int NewEmployee =0;
		try
		{
			System.out.print("Enter No of Employee: ");
			NewEmployee = Integer.parseInt(new Employee().ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		if(NewEmployee>0)
		{
			Employee ob[] = new Employee[NewEmployee];
			for(int i=0;i<ob.length;i++)
			{
				ob[i]=new Employee();
				ob[i].getData();
			}
			for(int i=0;i<ob.length;i++)
			{
				ob[i].showData();
			}
		}
	}
}