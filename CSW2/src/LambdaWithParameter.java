

/*

@FunctionalInterface
interface reportCard
{
	public int marksForSubject(int math,int physics,int biology,int history,int chemistry);
}

public class LambdaWithParameter
{
	public static void main(String[] args)
	{
		reportCard card1 = ( math, physics, biology, history, chemistry) ->
						{
							return (math+physics+biology + history+chemistry);
						};
						System.out.println(card1.marksForSubject(10, 20, 30, 40, 50));
						
				
		
		reportCard card2_engg = (math, physics, biology, history, chemisty) ->
		{
			return math*2 + physics*5 + biology*3;
		};
		System.out.println(card2_engg.marksForSubject(10, 20, 30, 40, 50));
		
		
		
		reportCard card3 = (math, physics, biology, history, chemisty) ->
		{
			return math*2 + physics*2 + biology*2 + history*2 + chemisty*2;
		};
		System.out.println(card3.marksForSubject(10, 20, 30, 40, 50));
		
	}
}

*/

import java.util.*;
public class LambdaWithParameter
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		int sum = 0;
		
		list.forEach((x)->
		{
			System.out.println(x);
		});
	}
}
