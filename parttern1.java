//parttern1  9907900320
import java.io.*;
class parttern1
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
			System.out.print(e);
		}
	}
	public void showData()
	{
		 for(int i=n;i>=1;i--)
		 {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		 }
	}
}

class Demo
{
	public static void main(String[] args)
	{
		parttern1 ob = new parttern1();
		ob.getData();
		ob.showData();
	}
}