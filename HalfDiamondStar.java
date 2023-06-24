import java.util.Scanner;
public class HalfDiamondStar 
{
	public static void main(String[] args) 
	{
		int i, j, rows, columns;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		rows = scanner.nextInt();
		columns = 1;
		
		for(i = 1; i <= rows * 2; i++)
		{
			for(j = 1; j<=columns; j++)
			{
				System.out.print('*');
			}
			if(i < rows)
			{
				columns++;
			}
			else
			{
				columns--;
			}
			System.out.println(" ");
		}
	}
}