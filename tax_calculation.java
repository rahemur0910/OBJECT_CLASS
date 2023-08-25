/*
	Define a class Employee having the following description:
	Instance variables:
	int pan to store personal account number
	String name to store name
	double tax_income to store annual taxable income
	double tax to store tax that is calculated
	Member functions:
	input () Store the pan number, name, taxable income
	calc() Calculate tax for an employee
	display () Output details of an employee
	Write a program to compute the tax according to the given conditions and display the output
	as per the given format.
	
	Total Annual Taxable Income & Tax Rate
	Upto 1,00,000 No tax
	From 1,00,001 to 1,50,000 10% of the income exceeding 1,00,000
	From 1,50,001 to 2,50,000 5000 + 20% of the income exceeding 1,50,000
	Above 2,50,000 25,000 + 30% of the income exceeding 2,50,000
	Output:
	Pan Number Name Tax-income Tax
	--- ---- ---------- -----
*/
import java.io.*;
class Employee
{
	String name,pan;
	double tax_income,tax;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
			System.out.print("Enter Pan Number: ");
			pan = ad.readLine();
			System.out.print("Enter Name: ");
			name = ad.readLine();
			System.out.print("Enter Tax Income: ");
			tax_income = Double.valueOf(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		if(tax_income<=100000)
		{
			tax = 0;
		}
		else if(tax_income<=150000)
		{
			tax = 0.1 * (tax_income - 100000);
		}
		else if(tax_income<=250000)
		{
			tax = 5000+0.2*(tax_income-150000);
		}
		else
		{
			tax = 2500+0.3*(tax_income-250000);
		}
		System.out.printf("%s\t%s\t%.2f\t%.2f%n",pan,name,tax_income,tax);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		int NewEmployee = 0;
		try
		{
			System.out.print("Enter number of Employee: ");
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
				ob[i] = new Employee();
				ob[i].getData();
			}
			System.out.println("\nPan Number Name Tax-income Tax");
			System.out.println("---\t----\t----------\t-----");
			for(int i=0;i<ob.length;i++)
			{
				ob[i].showData();
			}
			
		}
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       