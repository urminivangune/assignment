package javaass1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l=Arrays.asList(22,4,2,6,5,4,4,6,7,8,9,8);
List<Integer> sort=l.stream().sorted().distinct().collect(Collectors.toList());
	System.out.println("list before sorting\n"+ l);
	System.out.println("list after sort and dist function\n"+sort);
	}

}
