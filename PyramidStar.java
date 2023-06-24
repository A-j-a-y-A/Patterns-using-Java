import java.util.Scanner;
public class PyramidStar {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for(i = 1; i<= N; i++) 
		{
			for(j = i; j<N; j++) 
			{
				System.out.print(' ');
			}
			for(j = 1; j<=(2*i)-1; j++)
			{
				System.out.print('*');
			}
			System.out.println(' ');
		}

	}

}
