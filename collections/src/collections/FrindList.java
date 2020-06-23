package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class FrindList {

	public static void main(String[] args) {
		ArrayList friends=new ArrayList();
		friends.add("veena");
		friends.add("seema");
	    friends.add("kavya");
	    System.out.println(friends);
	    
	    System.out.println("using for loop");
	    for(Object obj:friends)
	    {
	    	String str = (String)obj;
	    	System.out.println(str);
	 
	    }
	    System.out.println("using Iterator");
	    Iterator i=friends.iterator();
	    while(i.hasNext())
	    {
	    	String str = (String)i.next();
	    	System.out.println(str);
	    }
	    friends.add(0, "manu");
	    System.out.println(friends);
	    friends.set(2, "anu");
	    System.out.println(friends);
	    
	    Employee emp =new Employee("ranju", 1234.0);
	    Employee emp1 =new Employee("manu", 1234.0);
	    Employee emp2 =new Employee("abhi", 1234.0);
	    ArrayList<Employee> empList=new ArrayList<>();
	    empList.add(emp);
	    empList.add(emp1);
	    empList.add(emp2);
	    System.out.println(empList);
	    System.out.println("using iterator==============");
	    Iterator i1=empList.iterator();
	    
	    while(i1.hasNext())
	    {
	    	
        System.out.println(i1.next());
        
        
	    }
	boolean r =empList.remove(emp);
	System.out.println("removed emp");
	System.out.println(empList);
	}
}

