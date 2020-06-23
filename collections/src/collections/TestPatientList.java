package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestPatientList {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		ArrayList <Patient>list=new ArrayList<>();
        Patient p1=new Patient(101, "ram", 35);
        Patient p2=new Patient(102, "hema", 40);
        Patient p3=new Patient(103, "suma", 22);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sorted on name");
        for(Patient patientobj2:list)
        {
        	System.out.println(patientobj2);
        }
        Set<Patient> set=new TreeSet<>();
        System.out.println("ADDED TO TREE SET");
        set.addAll(list);
        System.out.println(set);
        Collections.sort(list,new PatientageComparator());
        System.out.println("sorted on age");
        for(Patient patientobj3:list)
        {
        	
        System.out.println(patientobj3);
        	
        }
       
	}

}
