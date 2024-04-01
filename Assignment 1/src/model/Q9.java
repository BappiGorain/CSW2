package model;

import java.util.*;

class Student {
    private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public boolean removeCourse(Course course) {
		return this.courses.remove(course);
	}

	
	public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}


class Course implements entollmentSystem{

    private String code;
    private String name;
    private List<Student> students;


    @Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + "]";
	}

	public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public boolean removeStudent(Student student) {
		return this.students.remove(student);
	}

	public void display() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }

	@Override
	public void enroll(Student student) {
		this.students.add(student);
		
	}

	@Override
	public void drop(Student student) {
		this.students.remove(student);
		
	}

	@Override
	public void displayentollment() {
		System.out.println("entollments in course: "+this.name);
		for(Student s: this.students) {
			System.out.println(s);
		}
		
	}
}


interface entollmentSystem {

    public void enroll(Student student);

    public void drop(Student student);

    public void displayentollment();
}


class entollment {
	
	public Course course;
	public Student student;
	
	public static List<entollment> entollments = new ArrayList<>();
	
	entollment(Course course, Student student){
		this.course = course;
		this.student = student;
	}
	
	
	public static void enroll(Student student, Course course) {
		entollments.add(new entollment(course, student));
		course.enroll(student);
		System.out.println("entollment Created!");
		
	}

	public static void drop(Student student, Course course) {
		if(entollments.remove(new entollment(course, student))) {
			course.drop(student);
			System.out.println("entollment Dropeed!");
		}else {
			System.out.println("entollment don't exist!");
		}
		
		
	}

	@Override
	public String toString() {
		return "entollment [course=" + course + ", student=" + student + "]";
	}

	public static void sisplayDetails() {
		for(entollment e: entollments) {
			System.out.println(e);
		}
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(course, student);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		entollment other = (entollment) obj;
		return Objects.equals(course, other.course) && Objects.equals(student, other.student);
	}
	
	
}

public class Q9 {
    public static void main(String[] args) {

        Student s1 = new Student(1001, "abc");
        Student s2 = new Student(1002, "bcd");
        Student s3 = new Student(1003, "cde");

        Course c1 = new Course("CS1", "ICP");
        Course c2 = new Course("CS2", "DSA");

        


        entollment.enroll(s1, c1);
        entollment.enroll(s2, c1);
        entollment.enroll(s3, c1);
        entollment.enroll(s1, c2);
        entollment.enroll(s2, c2);

        entollment.sisplayDetails();

        entollment.drop(s1, c1);
        entollment.drop(s2, c2);
        entollment.drop(s3, c2);


        entollment.sisplayDetails();
    }

}
