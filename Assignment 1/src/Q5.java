

class College
{
	private String collegeName;
	private String collegeLoc;
	
	College(String cn, String cl)
	{
		this.collegeName = cn;
		this.collegeLoc = cl;
	}
	
	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
		
	}


	public String getCollegeLoc() {
		return collegeLoc;
	}


	public void setCollegeLoc(String collegeLoc) {
		this.collegeLoc = collegeLoc;
	}
}



class Student
{
	private int studentId;
	private String studentName;
	private College myCollege ;

	public Student(int studentId, String studentName, College myCollege) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.myCollege = myCollege;
	}
	
	
	void displayStudentInfo()
	{
		System.out.println("Id: " + studentId + ", studenName: " + studentName + ", CollegeName: " + myCollege.getCollegeName() + ", collegeLoc: " + myCollege.getCollegeLoc());
	}
	
}



public class Q5 
{
	public static void main(String[] args) 
	{
		College college1 = new College("Mumabi","IIT Mumbai");
		
		Student std1 = new Student(1, "Rakesh", college1);
		std1.displayStudentInfo();
		
	}
}
