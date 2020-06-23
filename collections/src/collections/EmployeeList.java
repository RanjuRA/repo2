package collections;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
public class EmployeeList {

	
	
		static List<Employee> employeeList=
			      Arrays.asList(new Employee("Tom Jones", 45,"bangalore"), 
			                    new Employee("Harry Major", 25,"dvg"),
			                    new Employee("Ethan Hardy", 65,"delhi,,"),
			                    new Employee("Nancy Smith", 15,"mumbai"),
			                    new Employee("Deborah Sprightly", 29,"aa"));
			 public static void main(String args[]){
			   List<Employee> filteredList = employeeList.stream()
			                        .limit(2)
			                        .collect(toList());
			   filteredList.forEach(System.out::println);
			 } 
	}