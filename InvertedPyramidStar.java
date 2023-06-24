import java.util.Scanner;
public class InvertedPyramidStar {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for(i = 1; i <= N; i++)
		{
			for(j = 1; j < i; j++)
			{
				System.out.print(' ');
			}
			for(j = i; j <= N * 2 - i; j++)
			{
				System.out.print('*');
			}
			System.out.println(' ');
		}

	}

}
