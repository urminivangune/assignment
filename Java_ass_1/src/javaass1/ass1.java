package javaass1;

import java.util.*;

import java.util.stream.Collectors;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("enter marks");
Scanner sc=new Scanner(System.in);
List<Integer> l=new ArrayList<Integer>();
for(int i=0;i<5;i++)
{
	int sub=sc.nextInt();
	l.add(sub);
}
for(int c:l)
{
	System.out.println(c);
}
Double avg=l.stream().collect(Collectors.averagingDouble(e->e));
System.out.println("avg="+avg);
	}

}
