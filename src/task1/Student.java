package task1;

public class Student {
	protected String name;
	protected int studentID;
	
	
	public Student() {
		System.out.println("Student class no arg constructor");
	}
	public Student(String name,int studentID) {
		//super(); // this is a call to super classes no arg constructor
		
		this.name= name;
		this.studentID = studentID;
		System.out.println("Student class 2 args constructor");
	}
	
	public void study() {
		
		System.out.println("Studying");
	}
	
	public void printDetail() {
		System.out.println(name+" "+studentID);
		
	}
}
