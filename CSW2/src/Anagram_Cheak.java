import java.util.HashMap;

public class Anagram_Cheak 
{
	public static boolean anagram(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		HashMap<Character, Integer> frequency1 = new HashMap<>();
		
		for(int i=0;i<s1.length();i++)
		{
			frequency1.put(s1.charAt(i), frequency1.getOrDefault(s1.charAt(i), 0) + 1);
		}
		
		HashMap<Character,Integer> frequency2 = new HashMap<>();
		
		for(int i=0;i<s2.length();i++)
		{
			frequency2.put(s2.charAt(i), frequency2.getOrDefault(s2.charAt(i), 0) + 1);
		}
		
		System.out.println(frequency1);
		System.out.println(frequency2);
		
		
//		for(int i=0;i<s1.length();i++)
//		{
//			if(!frequency1.containsKey(frequency2))
//			{
//				return false;
//			}
//		}
		
		
//		if(frequency1.equals(frequency2))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		return frequency1.equals(frequency2);
	}
	
	 public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        
	        if (anagram(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	
}
