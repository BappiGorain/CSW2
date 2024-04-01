package package2;


class Student implements Comparable<Student> {
    private int rn;
    private String name;
    private double totalMarks;

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student [rn=" + rn + ", name=" + name + ", totalMarks=" + totalMarks + "]";
    }

    public Student(int rn, String name, double totalMarks) {
        this.rn = rn;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public static void search(int rollno, Student arr[]) {
        boolean found = false;
        for (Student std : arr) {
            if (std.rn == rollno) {
                found = true;
                System.out.println(std);
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public int compareTo(Student other) {
        if (this.rn == other.rn) {
            return 0;
        } else if (this.rn > other.rn) {
            return 1;
        }
        return -1;
    }

}

public class Q4 {
    public static void main(String args[]) {
        Student arr[] = new Student[5];
        arr[0] = new Student(1, "Aman", 300);
        arr[1] = new Student(2, "Rakesh", 350);
        arr[2] = new Student(3, "Raju", 410);
        arr[3] = new Student(4, "Jaggu", 405);
        arr[4] = new Student(5, "Bheem", 420);

        int target = 2;

        Student.search(target, arr);

    }
}