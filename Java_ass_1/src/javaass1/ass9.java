package javaass1;

import java.util.function.Predicate;

public class ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> p=i->i%2==0;
int number[]= {2,7,65,4};
for(int num:number)
{
	if(p.test(num))
	{
		System.out.println(num+"is even");
	}
}
Predicate<Integer> p1=i->i%2==1;
int number1[]= {2,7,65,4};
for(int num1:number1)
{
	if(p1.test(num1))
	{
		System.out.println(num1+"is odd");
	}
}
	}

}
