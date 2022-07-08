package javatraining;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i<=1000 ; i++)   //(int i = 1000; i<=1;i--)
//		{	
//			System.out.print("Value of i:");
//			System.out.println(i);
//	}
//	}
//
//}	
int number = 8;
boolean isPrime = true;
for(int i = 2; i < number/2; i++)
{
	if(number % i == 0)
	{
		isPrime = false;
	}
}
if(isPrime == true)
{
System.out.println("The number is a prime number");
}
else
{
System.out.println("The number is not a prime number");
}}}