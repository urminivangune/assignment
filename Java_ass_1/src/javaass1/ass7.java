package javaass1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ass7 {

	public static void main(String []args)
	{
		List<Even1ass7> l=new ArrayList<Even1ass7>();
		l.add(new Even1ass7(1,"sugar",50f));
		l.add(new Even1ass7(1,"milk",70.70f));
		l.add(new Even1ass7(1,"tea",100f));
		List<Float> evenList=l.stream().filter(p->p.price%2==0).map(p->p.price).collect(Collectors.toList());
	
	System.out.println(evenList);
	}
		
	}


