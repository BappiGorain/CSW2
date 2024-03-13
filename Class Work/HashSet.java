import java.util.HashSet;

class Student1
{
	int id;
	String name;
	int age;
	
	public Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object another)
	{
		if(another instanceof Student1)
		{
			Student1 s1 = (Student1) another; 
			
			if((this.age == s1.age) && (this.name == s1.name) && (this.id == s1.id))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}


  // This is equal the hash code for same object  (Important for searching)
	@Override
	public int hashCode()
	{
		return id + name.hashCode()+ age;
	}
}

public class Demo 
{
	public static void main(String[] args) 
	{
		HashSet<Student1> haset = new HashSet<>();
		haset.add(new Student1(1, "ABCD", 23));
		haset.add(new Student1(2, "EFGH", 25));
		haset.add(new Student1(3, "IJKL", 28));
		haset.add(new Student1(1, "ABCD", 23));
		System.out.println(haset);
		
		System.out.println(haset.contains(new Student1(1, "ABCD", 23)));
	}
} 
