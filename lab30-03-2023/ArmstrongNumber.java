package basic;

import java.until.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int i=1,arm;
		System.out.println("Armstrong numbers between 1 to 999");
		while(i<1000)
		{
		arm=armstrongOrNot(i);
		if(arm==i)
		System.out.println(i);
		i++;
		}
		}
	static int armstrongOrNot(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}
