package encapsulation;

import java.util.ArrayList;

public class HRArrayList {

	public static void main(String[] args) {

		System.out.println("============ARRAYLIST=============");
		//create an arrayList that can hold Employee object
		//list-arraylist
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		//ArrayList<Employee> employeesStr = new ArrayList<>();
		
		employees.add(new Employee(31, "ASD", "ASd", 100000.0));
		employees.add(new Employee(26, "dfgh", "fdfsdf", 135000.0));
		employees.add(new Employee(23, "gfgs", "sdf", 120000.0));
		
		// increase Emrah's salary by 1000
		double newSalary = employees.get(2).getSalary()+5000;
		employees.get(2).setSalary(newSalary);
		
		System.out.println("Emrah's salary: "+employees.get(2).getSalary()); //120000+5000
		
		//look for employees whose salary is more than 120000 and print first and last name
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getSalary() >= 126000) {
				System.out.println(employees.get(i).getFirstName()+" "+employees.get(i).getLastName());
			}
		}
		
	}

}
