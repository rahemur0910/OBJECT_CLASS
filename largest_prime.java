// Largetst Prime by take multipule input.

import java.io.*;
class LargestPrime
{
	int x,n,c;
	int f = 0;
	int large = 0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter how many inputs do you have: ");
		x = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void LargeData()
	{
		for(int i=1;i<=x;i++)
		{
			try
			{
				System.out.print("Enter your inputs Data: ");
				n = Integer.parseInt(ad.readLine());
			}
			catch(Exception e)
			{
				System.err.print(e);
			}
			c =0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
				if(c==2)
				{
					if(f==0)
					{
						large=n;
						f=1;
					}
					else
					{
						if(n>large)
							large=n;
					}
				}
			}
		}
		if(f==0)
		{
			System.out.println("Largest Prime number is: "+large);
		}
		else
		{
			System.out.println("non Largest Prime number.");
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		LargestPrime ob = new LargestPrime();
		ob.getData();
		ob.LargeData();
	}
}