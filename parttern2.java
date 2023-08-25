// parttern2
import java.io.*;
class parttern2
{
	int n;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
			System.out.print("Enter no of Terms: ");
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
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		parttern2 ob = new parttern2();
		ob.getData();
		ob.showData();
	}
}