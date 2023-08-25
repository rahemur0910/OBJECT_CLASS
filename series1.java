// 1 4 9 16 25 36....... 100

class Series
{
	public int count,b;
	public Series()
	{
		count=1;
		b = 10;
	}
	public void showData()
	{
		while(count<= b)
		{
			System.out.print(count*count+"  ");
			count=count+1;
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Series ob = new Series();
		ob.showData();
	}
}