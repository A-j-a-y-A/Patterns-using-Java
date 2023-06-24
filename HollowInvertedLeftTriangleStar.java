import java.util.Scanner;
public class HollowInvertedLeftTriangleStar {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for(i = 1; i <= N; i++) 
		{
			for(j = 5; j >= i; j--) 
			{
				if(i == 1 || j == 1 || i == N || j == N || i == j) 
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
