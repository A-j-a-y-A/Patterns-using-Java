import java.util.Scanner;
public class MirroredHalfDiamondStar 
{
	public static void main(String[] args) 
	{
		int i, j, rows;
		int star, spaces;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		rows = scanner.nextInt();
		spaces = rows - 1;
		star = 1;
		for(i = 1; i <= rows * 2; i++)
		{
			for(j = 1; j <= spaces ; j++)
			{
				System.out.print(' ');
			}
			for(j = 1; j <= star; j++)
			{
				System.out.print("*");
			}
			System.out.println(' ');
			if(i < rows)
			{
				star++;
				spaces--;
			}
			else
			{
				star--;
				spaces++;
			}
		}

	}

}
