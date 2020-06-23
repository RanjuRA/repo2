package collections;

import java.util.ArrayList;

public class Employee {
		private String empname;
		private double salary;
		private String loc;
		public Employee(String empname,double salary,String loc)
		{
			super();
			this.empname=empname;
			this.salary=salary;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		@Override
		public String toString() {
			return  "[empname=" + empname + ", salary=" + salary + "]";
		}
		
		
	}

