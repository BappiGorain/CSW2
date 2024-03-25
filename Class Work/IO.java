import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class IO {
	public static void main(String args[]) 
	{ 
		
		Scanner scannerObj=null;
//		try 
//		{
			// scannerObj = new Scanner(new File("abc.txt"));
			scannerObj = new Scanner("Bappi\n30\n90\n");
//		} catch (FileNotFoundException e) 
//		{	
//			e.printStackTrace();
//		} 
		System.out.println("Enter the name of the student");
		
		
		String studentNAME = scannerObj.next(); 
		System.out.println("Enter the roll number of the student");
		
		
		int studentRollNumber = scannerObj.nextInt(); 
		System.out.println("Enter the marks that the student obtained");
		
		
		
		float studentMarks = scannerObj.nextFloat(); 	 	
		System.out.println("-------Student Report Card-------");
		System.out.println("Student Name:" + studentNAME);
		System.out.println("Student Roll No.:" + studentRollNumber);
		System.out.println("Student Marks:" + studentMarks); 
		
		scannerObj.close(); 
	}
} 