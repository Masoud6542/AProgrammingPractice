import java.util.Scanner;
public class testdemo
{
	public static void main(String[] args)
	{
		double setDim [] = new double [3];
		int i = 0;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("Enter the desired dimentions:");
			for (int j=0; j<3; j++)
			{
				setDim[j] = input.nextDouble();
			}		
			
			Box mybox = new Box(setDim[0], setDim[1], setDim[2]);
			System.out.println("This box's volume is: " + mybox.volume() +
			 "\n");
			i++;
			
		} while(i==i++);
	
		
	}
}
