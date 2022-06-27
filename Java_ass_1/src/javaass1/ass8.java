package javaass1;

import java.util.Scanner;

public class ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(isEven(a));
	}

	private static  boolean isEven(int a) {
		if(a%2==0)
		{
			return true;
			
		}
		else 
		{
			
		return false;
		}
		
	}

}
