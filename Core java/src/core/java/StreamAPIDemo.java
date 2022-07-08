package core.java;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer>ol=List.of(12, 21, 12, 32,0, 98);
		System.out.println(ol);
		
//		List<Integer> el=new ArrayList<>();
//		for(Integer i:ol)
//		{
//			if(i%2==0)
//			{
//				el.add(i);
//			}
//		}
//		System.out.println(el);
		
		
		Stream<Integer> stream=ol.stream();//ol means 
		List<Integer>evenlist=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenlist);	
	}	
	}


