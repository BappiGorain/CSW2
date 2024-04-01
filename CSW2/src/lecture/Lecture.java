package lecture;

import java.util.*;
class InvalidStudentExceptionUnhecked extends RuntimeException{

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

public class Lecture {
	private int classId;
	private String subj;
	private String roomNo;
	List<Student> students;
	
	
	
	public Lecture(int Id, String sub, String room) {
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
		 Lecture l1 = new Lecture(10,"CSW2" , "5011");
		 l1.addStudent(new Student(1,"CSW",20));
		 
		 Lecture l2 = new Lecture(10,"CSW2" , "5011");
		 l2.addStudent(new Student(1,"CSW",20));
		 
		 System.out.println(l1);
		 System.out.println(l2);
	}
	

	public void addStudent(Student s){
		if(s==null) {
			throw new InvalidStudentExceptionUnhecked("Student", new NullPointerException("Null"));
		}
		students.add(s);
		
	}
}