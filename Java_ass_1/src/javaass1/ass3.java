package javaass1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l=new ArrayList<String>();
l.add("Urmila");
l.add("Anu");
l.add("Sumedha");
l.add("Sumedha");
l.add("Sumit");
List<String> sort=l.stream().sorted().distinct().collect(Collectors.toList());
	
for(int i=0;i<l.size();i++)
	{
	System.out.println(l.get(i));
	}
System.out.println("after operations\n"+sort);
	}

}
