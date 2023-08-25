// add its digits

import java.io.*;
class AddDigits
{
	int n,t,rem;
	int sum = 0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter the Number:" );
		n = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	public void showData()
	{
		t = n;
		while(t!=0)
		{
			rem = t%10;
			sum = sum + rem;
			t = t/10;
		}
		System.out.print("Add digits is:"+sum);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		AddDigits ob = new AddDigits();
		ob.getData();
		ob.showData();
	}
}