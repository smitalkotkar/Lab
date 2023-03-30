package basic;

import java.util.*;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int num=sc.nextInt();
		int fact=1,sum=0;
		int copy=num;

		if(num==0)
			sum=sum+fact;
		 else{

			 while(copy!=0)
			 {
			 fact=1;
			 int rem=copy%10;
			 	for(int i=1;i<=rem;i++)
					 fact=fact*i;
					 sum=sum+fact;
					 copy=copy/10;
		 }}

		 if(sum==num)
			 System.out.println("Strong Number");
		 else
			 System.out.println("Not a Strong Number");

	}

}
