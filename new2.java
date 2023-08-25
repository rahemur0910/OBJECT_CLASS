import java.io.*;
class Ap 
{
	int n,a[],flag=0,lp=0,sp=Integer.MAX_VALUE;
	BufferedReader ad = new BufferedReader ( new InputStreamReader(System.in));
	public void getSize()
	{
		System.out.println("Enter the array size ");
		try
		{
			n=Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.print("e");
		}
		if(n>0)
			a = new int [n];
	}
	public void getData()
	{
		System.out.println("Enter the elements of array ");
		try
		{
			for(int i=0;i<a.length;i++)
			{
				a[i] = Integer.parseInt(ad.readLine());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void foundPrime()
	{
		for (int i=0; i<a.length; i++)
		{
			flag=0;
			for (int j=2; j<a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					flag=1;
					break;
				}
				
			}
		 		
			if(flag==0)
			{
				if (a[i] > lp) 
				{
					lp = a[i];
				}
                if (a[i] < sp) 
				{
                    sp = a[i];
                }
			}

		}
		

		
	}
			
	public void showData()
	{
		    System.out.println("Largest prime number in the array: " + lp);
            System.out.println("Smallest prime number in the array: " + sp);
	}	
}
class ApRun
{
	public static void main (String args[])
	{
		Ap ob = new Ap();
		ob.getSize();
		ob.getData();
		ob.foundPrime();
		ob.showData();
	}
}