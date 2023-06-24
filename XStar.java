import java.util.Scanner;
public class XStar 
{
	public static void main(String[] args) 
	{
		int i, j, N;
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		count = N * 2 - 1;
		for(i = 1; i <= count; i++)
		{
			for(j = 1; j <= count; j++)
			{
				if(j == i || (j == count - i + 1))
				{
					System.out.print('*');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println(' ');
		}

	}

}
