import java.util.*;


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}

class ArrayListUser {
    private ArrayList<User> userList;

    public ArrayListUser() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void printUsers() {
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }

    // Sort users by age using getter methods
    public void sortUsersByAge() {
        Collections.sort(userList, Comparator.comparingInt(User::getAge));
    }

    // Print the updated array list of users
    public void printSortedUsers() {
        System.out.println("\nSorted Users by Age:");
        printUsers();
    }

    public static void main(String[] args) {
        ArrayListUser userArrayList = new ArrayListUser();

        // Adding sample users
        userArrayList.addUser(new User("Alice", 30));
        userArrayList.addUser(new User("Bob", 25));
        userArrayList.addUser(new User("Charlie", 22));

        // Printing initial list
        System.out.println("Initial Users:");
        userArrayList.printUsers();

        // Sorting by age and printing updated list
        userArrayList.sortUsersByAge();
        userArrayList.printSortedUsers();
    }
}
