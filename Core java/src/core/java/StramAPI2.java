package core.java;

import java.util.ArrayList;

public class StramAPI2 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(11);
		marks.add(05);
		marks.add(30);
		marks.add(100);
		marks.add(102);
		marks.add(200);
		System.out.println(marks);
		
		ArrayLIst<Integer>updatedmarks= {ArrayList<Integer524>marks.stream().map(i->i+5).collect(Collectors)
				System.out.println(updatedmarks);
		marks.stream().filter(i->i<33).count();
		
		long failedstudents=marks.stream().filter(i->i<33).count();
		System.out.println(failedstudent);
	}
}
