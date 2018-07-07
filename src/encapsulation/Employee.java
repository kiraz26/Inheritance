package encapsulation;

public class Employee {
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private double salary;
	private Department department;
	
	//Constructor
	public Employee() {
		
	}
	public Employee(int employee_id, String first_name, String last_name, double salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}

	// Getters and Setters
	public void setEmployeeId(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getEmployeeId() {
		return employee_id;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getFirstName() {
		return first_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getLastName() {
		return last_name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
