import java.util.Scanner;
public class LeftArrowStar 
{
	public static void main(String[] args) 
	{
		int i, j, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		n = scanner.nextInt();
		for(i = 1; i < n; i++)
		{
			for(j = 1; j <= (n-i); j++)
			{
				System.out.print(' ');
			}
			for(j = i; j <= n; j++)
			{
				System.out.print('*');
			}
			System.out.println(' ');
		}
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j < i; j++)
			{
				System.out.print(' ');
			}
			for(j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println(' ');
		}
	}
}