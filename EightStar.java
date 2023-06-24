import java.util.Scanner;
public class EightStar 
{
	public static void main(String[] args) 
	{
		int i, j, size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		size = scanner.nextInt();
		for(i = 1; i < size * 2; i++)
		{
			for(j = 1; j <= size; j++)
			{
				//condition for corner and center intersection
				if((i == 1 && (j == 1 || j == size)) || (i == size && (j == 1 || j == size)) || (i == size * 2 - 1 && (j == 1 || j == size)))
				{
					System.out.print(' ');
				}
				else if(i == 1 || i == size || i == (size * 2) - 1 || j == 1 || j == size)
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
