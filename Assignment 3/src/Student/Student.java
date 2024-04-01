package Student;

public class Student <T> {
	private int member;
	private String name;
	private T roll;
	private int age;
	public Student(int member, String name, T roll, int age) {
		this.member=member;
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public T getRoll() {
		return roll;
	}
	public void setRoll(T roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
