package lecture;

import java.util.function.Function;

@FunctionalInterface
interface Cgpa_Student
{
	double calc_cgpa_students(Student123 s);
}

class Student123
{
	String name;
	int age;
	double []y_marks;
	String course;
	public Student123(String name, int age, double[] y_marks,String course)
	{
		this.name = name;
		this.age = age;
		this.y_marks = y_marks;
		this.course = course;
	}
	
	public int award_class(Function<Student123, Double> e)
	{
		double cgpa = e.apply(this);
		
		
		if(cgpa > 8)
		{
			return 1;
		}
		else if(cgpa<=8 && cgpa>=7.5)
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
}

public class Lambda
{
	public static void main(String args[])
	{
		double y_marks[] = new double[4];
		y_marks[0] = 7.08;
		y_marks[1] = 5.18;
		y_marks[2] = 10;
		y_marks[3] = 8;
		
		
		
		Student123 s1 = new Student123("Bappi",20,y_marks,"Btech");
		
		Student123 s2 = new Student123("Bappi",20,y_marks,"Mtech");
		
		
		Function<Student123, Double> c1 = (Student123 s) -> 
		{
				double[] y_mark = s.y_marks;
				
				double cgpa = 0;
				
				for(int i=0;i<s.y_marks.length;i++)
				{
					cgpa += y_mark[i];
				}
				
				cgpa/=y_marks.length;
				
				cgpa= (y_marks[0]+y_marks[1] +y_marks[2] + y_marks[3])/4;
				return cgpa;
		};
		
		
		
		Function<Student123, Double> c3 = (Student123 s) -> 
		{
				double[] y_mark = s.y_marks;
				
				double cgpa = 0;
				
				for(int i=0;i<s.y_marks.length;i++)
				{
					cgpa += y_mark[i];
				}
				
				cgpa/=y_marks.length;
				
				cgpa= (y_marks[0]+y_marks[1] +y_marks[2] + y_marks[3])/4;
				return cgpa;
		};
		
		System.out.println("B.Tech : " + s1.award_class(c1));
		
		
		Function<Student123, Double> c2 = (Student123 s) ->
			{
				double[] y_mark = s.y_marks;
				
				double cgpa = 0;
				
				for(int i=0;i<s.y_marks.length;i++)
				{
					cgpa += y_mark[i];
				}
				
				cgpa/=y_marks.length;
				
				cgpa= (y_marks[0]+y_marks[1]*2)/3;
				return cgpa;
			
		};
		
		System.out.println("M.Tech : " + s2.award_class(c2));
		
	}
}