
public class Matrix_Multiplication
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		int row = 3;
		int col = 3;
		
		int matrix1[][] = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j] = (int) (Math.random()*10) + 1;
			}
		}
		
		
		int matrix2[][] = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[i][j] = (int) (Math.random()*10) + 1;
			}
		}
		
		System.out.println("First matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Second matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		long startTime = System.currentTimeMillis();
		
		
		int result[][] = new int[row][col];
		Thread[] tarr = new Thread[row*col];
		int index = 0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[i][j] = 0;
				final int i1=i;
				final int j1=j;
				Runnable r=() ->
				{
					for(int k=0;k<col;k++)
					{
						result[i1][j1] += matrix1[i1][k] * matrix2[k][j1];
					}
				};
				Thread t1 = new Thread(r);
				tarr[index++] = t1;
				t1.start();
			}
		}
		
		for(int i=0;i<row*col;i++)
		{
			tarr[i].join();
		}
		
		long endTime = System.currentTimeMillis();
		
		
		System.out.println("Result matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("startTime: " + startTime);
		System.out.println("endTime: " + endTime);
	}
}
