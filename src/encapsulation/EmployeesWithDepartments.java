package encapsulation;

public class EmployeesWithDepartments {

	public static void main(String[] args) {

		Employee ASD = new Employee(31, "ASD", "ASD", 100000.0);

		Department ITDepartment = new Department(10, "IT");

		ASD.setDepartment(ITDepartment);
		//print Halil's department id and name
		System.out.println(ASD.getDepartment().getDepartment_id()+" "+ASD.getDepartment().getDepartmentName());
		
	}

}
