import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for (i = 1; i <= N; i++) {
			for(j = i; j < N; j++) {
				System.out.print(' ');
			}
			for(j = 1; j <= i; j++) {
				if(i == N || j == 1 || j == i) {
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
