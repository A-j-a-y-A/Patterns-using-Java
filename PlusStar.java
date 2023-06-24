import java.util.Scanner;
public class PlusStar 
{
	public static void main(String[] args) 
	{
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for(i = 1; i <= (N * 2 - 1); i++)
		{
			if(i == N)
			{
				for(j = 1; j <= (N * 2 - 1); j++)
				{
					System.out.print('+');
				}
			}
			else
			{
				for(j = 1; j <= N-1; j++)
				{
					System.out.print(' ');
				}
				System.out.print('+');
			}
			System.out.println(' ');
		}
	}
}