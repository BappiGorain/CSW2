
public class StringBuilder_StringBuffer
{
	public static void main(String args[])
	{
		StringBuffer sbuffer = new StringBuffer();
		for(int i=65;i<=70;i++)
		{
			char ch = (char)i;
			sbuffer = sbuffer.append(ch);
		}
		System.out.println("String Buffer append: " +sbuffer);
		
		StringBuilder sbuilder = new StringBuilder();
		
		for(int i=97;i<=102;i++)
		{
			char ch = (char)i;
			sbuilder = sbuilder.append(ch);
		}
		System.out.println("String Builder append: " + sbuilder);
		
		
		sbuffer = sbuffer.replace(0, 3, "WXYZ");
		System.out.println("String Buffer replace(0,3,WXYZ): " + sbuffer);
		
				
		sbuilder.replace(0, 3, "wxyz");
		System.out.println("String Builder replace(0,3,wxyz): " + sbuilder);
		
		sbuffer = sbuffer.delete(1, 2);
		System.out.println("String Buffer delete(1,2)" + sbuffer);
		
		
		sbuilder = sbuilder.delete(1, 2);
		System.out.println("String Builder delete(1,2)" + sbuilder);
		
//		System.err.println(sbuilder);
	}
}
