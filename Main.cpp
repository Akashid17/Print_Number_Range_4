
#include<iostream>

using namespace std;

class ArithmeticX
{
    public:
        int RangeSumEven(int,int);
};

int ArithmeticX::RangeSumEven(int iNo1, int iNo2)
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

int main()
{
    int iValue1 = 0, iValue2 = 0;
    int iRet = 0;

    cout<<"Enter First Number\n";
    cin>>iValue1;

    cout<<"Enter Second Number\n";
    cin>>iValue2;

    ArithmeticX aobj;
    iRet = aobj.RangeSumEven(iValue1,iValue2);

    if(iRet == -1)
    {
        cout<<"Invalid Range\n";
    }
    else
    {
        cout<<iRet<<endl;
    }

    return 0;
}