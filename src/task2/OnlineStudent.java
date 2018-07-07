package task2;

import task1.LocalStudent;
import task1.Student;

public class OnlineStudent extends Student {
	//name and studentID is accessible since it's protected
	int webinarID;
	

	public OnlineStudent() {
		super();
		System.out.println("OnlineStudent class no arg constructor");
	}
	//create a constructor that take 3 args set the value for name, studentID and webinarID
	
	public OnlineStudent(String name, int studentID, int webinarID) {
		this.name=name;
		this.studentID=studentID;
		this.webinarID=webinarID;
		System.out.println("OnlineStudent class 3 args constructor");
	}
	
	
	public void attendClassOnline() {
		System.out.println("Valid message OnlineStudent class");
	}
	//method overriding
	@Override // is optional, but once you put it before method will force overriding
	public void printDetail() { //<------------method overriding
		System.out.println(name+" "+studentID+ " "+webinarID);
		
	}
	
}
