package encapsulation;

import java.util.ArrayList;

public class HR {

	public static void main(String[] args) {

		// Array of Employee Object

		Employee[] employees = new Employee[3];
		Employee emp = new Employee(31, "sdfs", "fdhfh", 100000.0);
		employees[0] = emp;
		employees[1] = new Employee(26, "SDFs", "HAHA", 135000.0);
		employees[2] = new Employee(23, "ASD", "GDS", 120000.0);

		// Print the name and salary of first employee in the employees array
		System.out.println("First Name: " + emp.getFirstName() + " Last Name: " + emp.getLastName() + "\nSalary: "
				+ emp.getSalary());

		// loop through each employee and print - first name and salary
		for (Employee em : employees) {
			System.out.println("First Name: " + em.getFirstName() + " Last Name: " + em.getLastName() + "\nSalary: "
					+ em.getSalary());
		}

		// for loop
		for (int i = 0; i < employees.length; i++) {
			// Version 1)
			
			// System.out.println("First Name: " + employees[i].getFirstName() + " Last
			// Name: "
			// + employees[i].getLastName() + "\nSalary: " + employees[i].getSalary());
			
			// Version 2)
			Employee tempEmp = employees[i];
			System.out.println("First Name: " + tempEmp.getFirstName() + " Last Name: " + tempEmp.getLastName()
					+ "\nSalary: " + tempEmp.getSalary());
		}
		
		
		
		
		
		
	}

}
