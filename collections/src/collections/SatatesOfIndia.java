package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SatatesOfIndia {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("src\\collections\\states.txt");

		BufferedReader bf=new BufferedReader(f);
		Set<String> set=new  LinkedHashSet<>();
		String states=null;
		int count=0;
		while((states=bf.readLine())!=null)
		{
			count++;
			set.add(states);
		}
		System.out.println(set);
		System.out.println("no of states"+count);
		set.remove("delhi");
		System.out.println("after removing delhi" +set);
		TreeSet<String> tset=new TreeSet<>();
		tset.addAll(set);
		System.out.println("using treeset"+tset);
		System.out.println("display in sorted order");
		Iterator i=tset.iterator();

		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}

	}

}
