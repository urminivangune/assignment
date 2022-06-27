package javaass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	float sal;
	Employee(int id,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
public class ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> l=new ArrayList<Employee>();
l.add(new Employee(1,"urmi",600000));
l.add(new Employee(2,"sumi",900000));
l.add(new Employee(3,"bhumi",600000));
l.add(new Employee(4,"urmi",700000));
l.add(new Employee(5,"surekha",500000));
Map<Integer,String> proMap=l.stream().collect(Collectors.toMap(p->p.id,p->p.name));
System.out.println(proMap);
Set<String> emset=l.stream().map(p->p.name).collect(Collectors.toSet());
System.out.println(emset);
	}

}
