package lecture1;

import java.util.ArrayList;
import java.util.List;

class InvalidStudentExceptionUnhecked extends Exception{

	InvalidStudentExceptionUnhecked(String message, Throwable cause){
		super(message, cause);
	}
}




class Student{
	int roll;
	String name;
	int age;
	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class lecture1 {
	private int classId;
	private String subj;
	private String roomNo;
	List<Student> students;
	
	
	
	public lecture1(int Id, String sub, String room) {
		super();
		this.classId = Id;
		this.subj = sub;
		this.roomNo = room;
		
		this.students = new ArrayList<Student>();
		
		
	}

	@Override
	public String toString() {
		return "Lecture [classId=" + classId + ", subj=" + subj + ", roomNo=" + roomNo + ", students=" + students + "]";
	}

	public static void main(String[] args){
		 
		 
		 lecture1 l2 = new lecture1(15,"CSW2" , "501");
		 try {
			l2.addStudent(null);
		} catch (InvalidStudentExceptionUnhecked e) {
			e.printStackTrace();
		}
		 
		 System.out.println(l2);
	}
	

	public void addStudent(Student s) throws InvalidStudentExceptionUnhecked{
		if(s==null) {
			throw new InvalidStudentExceptionUnhecked("Student", new NullPointerException("Null"));
		}
		students.add(s);
		
	}
}