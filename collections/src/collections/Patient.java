package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Patient implements Comparable<Patient>
{
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId, String name, int age) {

		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient Details [patientId= "+ patientId + ", name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int compareTo(Patient obj)
	{
		return this.getName().compareTo(obj.getName());
	}
	public static int findAge(String name,TreeSet<Patient>patient)
	{
		int age=0;
		for(Patient patientobj:patient)
		{
			boolean res=patientobj.getName().equals(name);
			if(res==true)
			{
				age=patientobj.age;
			}
		}
		return age;
		
	}
}
class PatientageComparator implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) 
	{
	
		return o1.getAge()-o2.getAge();
	}
	
}