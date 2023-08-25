// prime array
// process 1
import java.io.*;
class prime
{
	int arr[];
	int n,count,i;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getSize()
	{
		try
		{
			System.out.print("Enter the size of the array: ");
			n = Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		if(n>0)
		{
			arr=new int[n];
		}
	}
	public void getData()
	{
		for(i=0;i<arr.length;i++)
		{
			System.out.print("Enter the elements: ");
			try
			{
				arr[i]=Integer.parseInt(ad.readLine());
			}
			catch(Exception e)
			{
				System.err.print(e);
				i--;
			}
		}
	}
	public void showData()
	{
		for(i=0;i<n;i++)
		{
			count=0;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(arr[i]+"  ");
			}
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		prime ob = new prime();
		ob.getSize();
		ob.getData();
		ob.showData();
	}
}