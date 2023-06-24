import java.util.Scanner;

public class HollowLeftTriangle {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		N = scanner.nextInt();
		for(i = 1; i <= N; i++) {
			for(j = 1; j <= i; j++) {
				if(j == 1 ||  j == i || i == N) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println(" ");
		}

	}

}
