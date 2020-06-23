package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		ArrayList <Integer>list= new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of students");
		int no=scan.nextInt();
		System.out.println("enter marks");
		for(int i=0;i<no;i++)
		{
		int marks=scan.nextInt();
		list.add(marks);
		}
		System.out.println(list);
		
		int max=list.get(0);
	   
		for(int i=0;i<no;i++)
		{
			 if(max<list.get(i))
			 {
			 max=list.get(i);
			 }
		}
		System.out.println("Maximum marks is  "+max);
		int sum=0;
		for(int i=0;i<no;i++)
		{
			sum=sum+list.get(i);
		}
		
		System.out.println("sum  is  "+sum);
      
	    int avg=sum/no;
	    System.out.println("average marks is  "+avg);
	    System.out.println( "3rd student marks  "+list.get(no-1));
	    
	}
}
