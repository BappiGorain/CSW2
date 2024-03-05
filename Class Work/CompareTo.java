class Student implements Comparable<Student>
{
	private String name;
	private int rollNo;
	private int age;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}
	
	public void  setRollNo(int r)
	{
		rollNo = r;
	}
	
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}

	public Student(String name, int rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.equals(o))
		
		return 0;
		
		else if(this.rollNo < o.rollNo)
			return -1;
		else
			return 1;
	}
}


public class CompareTo
{
	public static void main(String args[])
	{
		Student s1 = new Student("Bappi",10,20);
		Student s2 = new Student("Lahiri",15,21);
		Student s3 = new Student("Lahiri",15,21);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}
}
