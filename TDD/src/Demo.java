import org.junit.jupiter.api.*;

public class Demo {
@Test
//@RepeatedTest(20)
void sum()	
{
	int a=10;
	int b=20;
	System.out.println(a+b);
}
@Disabled
void display()	
{
	System.out.println("Executing tdd");	
}
}
