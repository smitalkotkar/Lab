package basic;

public class FactorialValue {
	
    for (int i = 1; i <= 10; i++) 
    {
        int fact = 1;
        for (int j = i; j >= 1; j--) 
        {
            fact *= j;
        }
        System.out.println("Factorial of " + i + " is: " + fact);
    }

}
