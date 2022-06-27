package javaass1;

import java.util.ArrayList;
import java.util.List;

public class ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(6);
		l.add(9);
		l.add(76);
		l.add(4);
		l.add(100);
		System.out.println(l.toString());
		int sum=l.stream().mapToInt(Integer::intValue).sum();
		int avg=sum/l.size();
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		System.out.println("numbers which are less than avg");
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)<avg)
			{
				System.out.println(l.get(i));
			}
		}
		
	}

}
