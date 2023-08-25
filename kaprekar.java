// kaprekar 
//compile problem
import java.io.*;
class Kaprekar
{
	int d=0;
	int s=0;
	int n,f,l;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter the Number: ");
		n = Integer.parseInt(ad.readLine()); 
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		for(int i=n;i>0;i++)
		{
			d++;
		}
		s = n*n;
		f = s/(int)Math.pow(10,d);
		l = s%(int)Math.pow(10,d);
		if(f+l==n)
		{
			System.out.print(n+" is kaprekar Number");
		}
		else
		{
			System.out.print(n+" is not kaprekar Number");
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Kaprekar ob = new Kaprekar();
		ob.getData();
		ob.showData();
	}
}