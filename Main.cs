
using System;

class ArithmeticX
{
	public int RangeSumEven(int iNo1, int iNo2)
	{
		if(iNo1 < 0 || iNo1 > iNo2)
		{
			return -1;
		}

		int iSum = 0;

		for(int i = iNo1; i <= iNo2; i++)
		{
			if(i%2 == 0)
			{
				iSum += i;
			}
		}

		return iSum;
	}
}

class main
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter First Number");
		int iValue1 = Convert.ToInt32(Console.ReadLine());
		
		Console.WriteLine("Enter Second Number");
		int iValue2 = Convert.ToInt32(Console.ReadLine());

		ArithmeticX aobj = new ArithmeticX();
		int iRet = aobj.RangeSumEven(iValue1,iValue2);

		if(iRet == -1)
		{
			Console.WriteLine("Invalid Range");
		}
		else
		{
			Console.WriteLine(iRet);
		}
	}
}