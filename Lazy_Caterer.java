// Lazy caterer
import java.io.*;
class LazyCaterer
{
	int a = 1, b = 0, num;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
			System.out.print("Enter the number of terms: ");
			num = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	public void showData()
	{
		for(int i=0;i<=num;i++)
		{
			a = a + b;
			System.out.print(a+"  ");
			b = b + 1;
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		LazyCaterer ob = new LazyCaterer();
		ob.getData();
		ob.showData();
	}
}