package core.java;

public class GenericMethodTest {
public static void main(String[] args) {
	Container<Integer> obj=new Container<>();
	obj.value=1;
	
	obj.show();
	}
}

class Container<E>
{E value;
public void show()

{
	System.out.println(value.getClass().getName());
	}}	