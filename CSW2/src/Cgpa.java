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
	
	
	/*

	public int award_class()
	{
		double cgpa = 0;
		for(int i=0;i<y_marks.length;i++)
		{
			cgpa += y_marks[i];
		}
		cgpa/=y_marks.length;
		
		
		if(course=="Mtech")
		{
			cgpa= (y_marks[0]+y_marks[1]*2)/3;
		}
		else if(course == "BSc")
		{
			cgpa = (y_marks[0]+y_marks[2]+y_marks[3])/3;
		}
		
		
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
	
	*/
	
	
	public int award_class(Cgpa_Student e)
	{
		double cgpa = e.calc_cgpa_students(this);
		
		
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

class cgpa_implementer_Mtech implements Cgpa_Student
{
	@Override
	public double calc_cgpa_students(Student123 s)
	{
		double[] y_marks = s.y_marks;
		
		double cgpa = 0;
		
		for(int i=0;i<s.y_marks.length;i++)
		{
			cgpa += y_marks[i];
		}
		
		cgpa/=y_marks.length;
		
		cgpa= (y_marks[0]+y_marks[1]*2)/3;
		return cgpa;
	}
}

class cgpa_implementer_Btech implements Cgpa_Student
{
	@Override
	public double calc_cgpa_students(Student123 s)
	{
		double y_marks[] = s.y_marks;
		double cgpa = 0;
		for(int i=0;i<y_marks.length;i++)
		{
			cgpa+=y_marks[i];
		}
		cgpa/=y_marks.length;
		if(cgpa > 8)		
		{
			return 1;
		}
		else if(cgpa<=8 && cgpa >7.5)
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
}


public class Cgpa
{
	public static void main(String args[])
	{
		double y_marks[] = new double[4];
		y_marks[0] = 7.08;
		y_marks[1] = 5.18;
		y_marks[2] = 10;
		y_marks[3] = 8;
		
		
		
		Student123 s1 = new Student123("Bappi",20,y_marks,"Btech");
//		System.out.println("Btech: " + s1.award_class());
		
		Student123 s2 = new Student123("Bappi",20,y_marks,"Mtech");
//		System.out.println("Mtech: " + s2.award_class());
		
		
//		Student123 s3 = new Student123("Bappi",20,y_marks,"BSc");
//		System.out.println("BSc: " + s3.award_class());
		
		cgpa_implementer_Mtech m = new cgpa_implementer_Mtech();
		System.out.println("Mtech: " + s2.award_class(m));
		
		cgpa_implementer_Btech b = new cgpa_implementer_Btech();
		System.out.println("B.Tech: " + s1.award_class(b));
		
		
	}
}