class Student<T extends Number> implements Comparable<Student<T>>
{
	private String name;
	private T rollNo;
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

	public T getRollNo() {
		return rollNo;
	}
	
	public void  setRollNo(T r)
	{
		rollNo = r;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}

	public Student(String name, T rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Student<T> o = (Student<T>) obj;
		if(this.rollNo == o.rollNo)
		{
			System.out.println("Hello");
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Student<T> o) {
		
		if(this.equals(o))
		
		return 0;
		
		else if(this.rollNo.doubleValue() < o.rollNo.doubleValue())
			return -1;
		else
			return 1;
	}
	

}
public class CompareTo
{
	public static void main(String args[])
	{
		Student<Integer> s1 = new Student<Integer>("Bappi",new Integer(10),20);
		Student<Integer> s2 = new Student<Integer>("Lahiri",new Integer(15),21);
		Student<Integer> s3 = new Student<Integer>("Lahiri",new Integer(15),21);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		
		Student<Integer> s4 = new Student<Integer>("Bappi",10,20);
		System.out.println(s4.compareTo(s1));
		
	}
}