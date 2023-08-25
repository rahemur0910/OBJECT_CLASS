// Factorial
import java.io.*;
class factorial
{
	int n;
	int fact = 1;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter an integer number: ");
		n = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print(n+",factorial is:"+fact);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		factorial ob = new factorial();
		ob.getData();
		ob.showData();
	}
}