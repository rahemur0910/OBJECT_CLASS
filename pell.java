// pell series
import java.io.*;
class pell
{
	int n,c;
	int a=1;
	int b=0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
		System.out.print("Enter no of terms: ");
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
			c = a + 2*b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		pell ob = new pell();
		ob.getData();
		ob.showData();
	}
}