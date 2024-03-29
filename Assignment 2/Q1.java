class Student<T>
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
}


public class Q1
{
	public static void main(String args[])
	{
		Student<Integer> s1 = new Student<Integer>("Bappi",10,20);
		Student<String> s2 = new Student<String>("Bappi","15",21);
		System.out.println(s1);
		System.out.println(s2);
	}
}
