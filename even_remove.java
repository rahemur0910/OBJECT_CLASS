 // even remove
import java.io.*;
class RemoveDigits
{
	int n,d = 0;
	int s = 0;
	int c = 0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter the number: ");
		n = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		for(int i=n;i>0;i=i/10)
		{
			d = i% 10;
			if(d%2!=0)
			{
				s = s+d*(int)Math.pow(10,c++);
			}
		}
		System.out.print("New Number: "+s);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		RemoveDigits ob = new RemoveDigits();
		ob.getData();
		ob.showData();
	}
}