package task3;

import task1.LocalStudent;
import task1.Student;
import task2.OnlineStudent;

public class Classroom {

	public static void main(String[] args) {
		Student student1 = new Student();

		LocalStudent local1 = new LocalStudent();
		LocalStudent local2 = new LocalStudent(123);

		OnlineStudent online1 = new OnlineStudent();
		OnlineStudent online2 = new OnlineStudent();
		OnlineStudent online3 = new OnlineStudent();
		OnlineStudent online4 = new OnlineStudent("Ismail", 4667, 3434);
		
//		student1.name="Halil";
//		student1.studentID = 1774;
		student1.study();
		student1.printDetail();
		
//		local1.name="Talha";
//		local1.studentID=1473;
		local1.study();
		local1.attendClassInPerson();
		local1.printDetail();
//		local2.name="Fatih";
//		local2.studentID = 1356;
		local2.study();
		local2.attendClassInPerson();
		local1.printDetail();
		
//		online1.name="Emre";
//		online1.studentID = 313;
		online1.study();
		online1.attendClassOnline();
		online1.printDetail();
//		online2.name="Ali";
//		online2.studentID = 313;
		online2.study();
		online2.attendClassOnline();
		online2.printDetail();
//		online3.name="Halit";
//		online3.studentID = 516;
		online3.study();
		online3.attendClassOnline();
		online3.printDetail();

	}

}
