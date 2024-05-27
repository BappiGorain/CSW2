import java.util.ArrayList;

class Q5 
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("KingCobra");
		list.add("Titanoboa");
		list.add("Python");
		list.add("Anaconda");
		list.add("Adder");
		
		
		list.stream().map(s->s.toUpperCase()).filter(s->vowel(s)).forEach(s->System.out.println(s));;
		
	}
	
	public static boolean vowel(String s)
	{
		String str = "AEIOUaeiou";
		for(int i=0;i<str.length();i++)
		{
			if(s.charAt(0) == str.charAt(i))
			{
				return true;
			}
		}
		return false;
//		return  s.charAt(0) == 'A' ||
//				s.charAt(0) == 'E' ||
//				s.charAt(0) == 'I' ||
//				s.charAt(0) == 'O' ||
//				s.charAt(0) == 'U' ||
//				s.charAt(0) == 'a' ||
//				s.charAt(0) == 'e' ||
//				s.charAt(0) == 'i' ||
//				s.charAt(0) == 'o' ||
//				s.charAt(0) == 'u' ;
//		
	}
}
