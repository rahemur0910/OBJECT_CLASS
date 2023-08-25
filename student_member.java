/*
	Define a class ‘Student’ described as below:
	Data members/instance variables:
	name, age, m1, m2, m3 (marks in 3 subjects), maximum, average
	Member methods:
	i. To accept the details of a student.
	ii. To compute the average and the maximum out of three marks.
	iii. To display the name, age, marks in three subjects, maximum and average.
	Write a main method to create an object of a class and call the above member methods.
*/
import java.io.*;
class Student
{
	String Name;
	int Age;
	double m1,m2,m3;
	double Average=0,Maximum=0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter Student Name: ");
		Name = ad.readLine();
		System.out.print("Enter Student Age: ");
		Age =Integer.parseInt(ad.readLine());
		System.out.print("Enter Student Mark 1: ");
		m1 = Double.valueOf(ad.readLine());
		System.out.print("Enter Student Mark 2: ");
		m2 = Double.valueOf(ad.readLine());
		System.out.print("Enter Student Mark 3: ");
		m3 = Double.valueOf(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		Maximum = Math.max(Math.max(m1,m2),m3);
		Average = (m1+m2+m3)/3;
		
		System.out.println("Student Name: "+Name);
		System.out.println("Student Age: "+Age);
		System.out.println("Student Mark 1: "+m1);
		System.out.println("Student Mark 2: "+m2);
		System.out.println("Student Mark 3: "+m3);
		System.out.println("Maximum Mark: "+Average);
		System.out.println("Average Mark: "+Maximum);
		System.out.println();
	}
}

class Demo
{
	public static void main(String[] args)
	{
		int NewStudent = 0;
		try
		{
			System.out.print("Enter Number of Student: ");
			NewStudent = Integer.parseInt(new Student().ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		if(NewStudent>0)
		{
			Student ob[] = new Student[NewStudent];
			for(int i=0;i<ob.length;i++)
			{
				ob[i]=new Student();
				ob[i].getData();
			}
			for(int i=0;i<ob.length;i++)
			{
				ob[i]=new Student();
				ob[i].showData();
			}
		}
	}
}