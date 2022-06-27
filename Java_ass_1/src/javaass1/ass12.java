package javaass1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l=Arrays.asList(56,9,4,23,9,6,33);
List<Integer> l1=l.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(l1);
	}

}
