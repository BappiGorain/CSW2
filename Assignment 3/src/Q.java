import java.util.ArrayList;

class User implements Comparable<User>
{
	private String name;
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
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(User obj)
	{
		if(this.equals(obj))
		{
			return 0;
		}
		
		User u = (User) obj;
		
		if(this.age > u.age)
		{
			return 1;
		}
		
		else
		{
			return -1;
		}
	}
	
}

public class Q
{
	
	public static void sort( ArrayList<User>userList)
	{		
		for(int i=0;i<userList.size()-1;i++)
		{
			for(int j=0;j<userList.size()-i-1;j++)
			{
				if(userList.get(j).compareTo(userList.get(j+1)) > 0)
				{
					User temp = userList.get(j);
					userList.set(j, userList.get(j+1));
					userList.set(j+1,temp);
				}
			}
		}		
		
	}
	
	
	public static void main(String args[])
	{
		ArrayList<User> userList = new ArrayList<>();
		
		User user1 = new User("Aman",25);
		User user2 = new User("Abhijeet",27);
		User user3 = new User("Raju",23);
		User user4 = new User("Piyush",22);
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(new User("Arnab",20));
		
		System.out.println(userList);
		
		Q.sort(userList);
		
		System.out.println(userList);
		
		
		
		
	}
}