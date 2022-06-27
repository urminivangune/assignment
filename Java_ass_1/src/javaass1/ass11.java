package javaass1;

import java.util.stream.IntStream;

public class ass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("strait...");
IntStream range=IntStream.rangeClosed(1,10);
range.forEach(System.out::println);
System.out.println("parallel");
IntStream range2=IntStream.rangeClosed(1,10);
range2.parallel().forEach(System.out::println);
	}

}
