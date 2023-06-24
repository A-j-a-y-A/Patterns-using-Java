import java.util.Scanner;
public class HollowPyramidStar {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for(i = 1; i <= N; i++) 
		{
			for(j = i; j < N; j++)
			{
				System.out.print(' ');
			}
			for(j = 1; j <= (2 *i) - 1; j++)
			{
				if(i ==  1 || j == 1 || i == N || j == (2 * i) - 1)
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
