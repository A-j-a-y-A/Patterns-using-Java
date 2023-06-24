import java.util.Scanner;
public class RightArrowStar 
{
	public static void main(String[] args) 
	{
		int i, j, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		n = scanner.nextInt();
		for(i = 1; i < n; i++)
		{
			for(j = 1; j <= (2 * i) - 2; j++)
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
			for(j = 1; j<=(2 * n - 2 * i); j++)
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
