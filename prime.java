// prime or Not
import java.io.*;
class Prime
{
	int n;
	int flag=0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter a integer number: ");
		n = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		if(n==0 || n==1)
		{
			flag=1;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print(n+",is a prime number.");
		}
		else
		{
			System.out.print(n+",is not a prime number.");
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Prime ob = new Prime();
		ob.getData();
		ob.showData();
	}
}