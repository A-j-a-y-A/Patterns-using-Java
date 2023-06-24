import java.util.Scanner;
public class HollowDiamondStar 
{
	public static void main(String[] args) 
	{
		int i, j, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		n = scanner.nextInt();
		for(i = 1; i <= n; i++)
		{
			for(j = i; j <= n; j++)
			{
				System.out.print('*');
			}
			for(j = 1; j <= (2 * i - 2); j++)
			{
				System.out.print(' ');
			}
			for(j = i; j <= n; j++)
			{
				System.out.print('*');
			}
			System.out.println(' ');
		}
		//loop to print the lower half
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{			
				System.out.print('*');
			}
			for(j = (2 * i - 2); j < (2 * n - 2); j++)
			{
				System.out.print(' ');
			}
			for(j = 1; j<=i; j++)
			{
				System.out.print('*');
			}
			System.out.println(' ');
		}
	}
}