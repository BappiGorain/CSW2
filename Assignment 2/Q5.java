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

    public int compareTo(Student other) {
        return Integer.compare(this.rn, other.rn);
    }

    public static void bubbleSort(Student arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

public class Q5 {
    public static void main(String args[]) {
        Student arr[] = new Student[5];
        arr[0] = new Student(10, "Aman", 300);
        arr[1] = new Student(2, "Rakesh", 350);
        arr[2] = new Student(8, "Raju", 410);
        arr[3] = new Student(7, "Jaggu", 405);
        arr[4] = new Student(4, "Bheem", 420);

        Student.bubbleSort(arr);

        System.out.println("After Bubble Sort with respect to Roll No: ");
        for (Student std : arr) {
            System.out.println(std);
        }

    }
}
