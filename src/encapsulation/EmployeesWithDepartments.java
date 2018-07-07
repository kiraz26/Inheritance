package encapsulation;

public class EmployeesWithDepartments {

	public static void main(String[] args) {

		Employee Halil = new Employee(31, "Halil", "Kiraz", 100000.0);

		Department ITDepartment = new Department(10, "IT");

		Halil.setDepartment(ITDepartment);
		//print Halil's department id and name
		System.out.println(Halil.getDepartment().getDepartment_id()+" "+Halil.getDepartment().getDepartmentName());
		
	}

}
