
import java.lang.*;
import java.util.*;

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

class Main
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First Number");
		int iValue1 = sobj.nextInt();

		System.out.println("Enter Second Number");
		int iValue2 = sobj.nextInt();

		ArithmeticX aobj = new ArithmeticX();
		int iRet = aobj.RangeSumEven(iValue1, iValue2);
		
		if(iRet == -1)
		{
			System.out.println("Invalid Range");
		}
		else
		{
			System.out.println(iRet);
		}
	}
}