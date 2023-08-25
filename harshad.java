 // harshad number
import java.io.*;
class Harshad
{
	int num,temp;
	int sum = 0;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
			System.out.print("Enter the Number: ");
			num = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	public void showData()
	{
		temp = num;
		while(temp>0)
		{
			sum = sum + temp%10;
			temp = temp/10;
		}
		int res = num % sum;
		if (res==0)
		{
			System.out.print(num+"is Harshad Number");
		}
		else
		{
			System.out.print(num+"is not Harshad Number");
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Harshad ob = new Harshad();
		ob.getData();
		ob.showData();
	}
}